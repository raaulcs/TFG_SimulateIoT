#!/bin/bash

# Define color variables
BLACK='\033[0;30m'
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[0;33m'
BLUE='\033[0;34m'
MAGENTA='\033[0;35m'
CYAN='\033[0;36m'
WHITE='\033[0;37m'
NC='\033[0m' # No Color

# Get the directory path of the script
SCRIPT_DIR=$(dirname "$0")

# Set the desired namespace (by default is default)
NAMESPACE="default"

# Cluster context (minikube by default, kubectl config view for more)
CONTEXT="minikube"
#"gke_tfgsimulateiot_us-central1_test-cluster"

# Google Cloud parameters
# Set the desired project and cluster details
PROJECT_ID="tfgsimulateiot"
CLUSTER_NAME="test-cluster"
LOCATION="europe-north1"


echo "Where do you want to execute your files?"
echo "[1] Local"
echo "[2] Google Cloud"
read -p "" choice

# Check if Minikube is running
if minikube status >/dev/null 2>&1; then
    echo "Minikube is running."
else
    echo "Minikube is not running."
	minikube start
fi

while true; do
	# Google Cloud option
	if [[ "$choice" == 2 ]]; then
		# Change context
		kubectl config use-context "$CONTEXT"

		# Authenticate with Google Cloud
		gcloud auth login

		# Set the project
		gcloud config set project "$PROJECT_ID"

		# Set the cluster context
		gcloud container clusters get-credentials "$CLUSTER_NAME" \
    		--location "$LOCATION"
		break
	# Local option
	elif [[ "$choice" == 1 ]];then
		# Change context
		kubectl config use-context "$CONTEXT"
		break
	else
		echo "Please select a valid option"
	fi
done

echo "=================================="

kubectl apply -f "$SCRIPT_DIR"/DeployV2/kubernetes

echo "The files are being deployed, please wait..."
sleep 10

kubectl get all


# Get the list of pods in the namespace
PODS=$(kubectl get pods -n "$NAMESPACE" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')
DEPLOYMENTS=$(kubectl get deployments -n "$NAMESPACE" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')
SVC=$(kubectl get services -n "$NAMESPACE" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')

# Directory where the logs will be stored
LOG_DIR="$SCRIPT_DIR/DeployV2/kubernetes/logs/"

# Check if the directory exists
if [ ! -d "$LOG_DIR" ]; then
    mkdir -p "$LOG_DIR"
fi

sleep 30

# Loop through each pod and save its logs to a separate file
for pod in $PODS; do
    echo "Getting logs for pod: $pod"
    kubectl logs -n "$NAMESPACE" "$pod" > "$SCRIPT_DIR"/DeployV2/kubernetes/logs/"$pod".log
    echo -e "${GREEN}Logs saved to: $SCRIPT_DIR/DeployV2/kubernetes/logs/$pod.log${NC}"
done

# Wait for 5 seconds between log updates
sleep 5

echo -e "${CYAN}Every 5 seconds the logs will be updated.${NC}"

# Continuously update the logs every 5 seconds until a key is pressed
while true; do

    # Loop through each pod and update its log file
    for pod in $PODS; do
        echo -e "${GREEN}Updating logs for pod: $pod${NC}"
        kubectl logs -n "$NAMESPACE" "$pod" > "$SCRIPT_DIR"/DeployV2/kubernetes/logs/"$pod".log
    done

    # Display the updated log files
    echo "Press any key to stop updating."

    # Wait for 5 seconds or user input
    read -t 5 -N 1 key

    # If a key is pressed, exit the loop
    if [[ -n "$key" ]]; then
		echo -e "${RED}Exiting. All logs are saved in "$SCRIPT_DIR"/DeployV2/kubernetes/logs/${NC}"
        break
    fi
done


# Loop through each service and delete it, except for the Kubernetes service
for service in $SVC; do
    if [[ $service != "kubernetes" ]]; then
        echo "Deleting service: $service"
        kubectl delete service "$service" -n "$NAMESPACE"
    fi
done

# Loop through each deployment and delete it
for deployment in $DEPLOYMENTS; do
    echo "Deleting deployment: $deployment"
    kubectl delete deployment "$deployment" -n "$NAMESPACE"
done

# Delete container
#gcloud container clusters delete "$CLUSTER_NAME" \
#    --location "$LOCATION"

