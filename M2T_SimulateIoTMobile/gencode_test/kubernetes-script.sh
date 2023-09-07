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

# Check if Minikube is running
if minikube status >/dev/null 2>&1; then
    echo "Minikube is running."
else
    echo "Minikube is not running."
	minikube start
fi

# Get the directory path of the script
SCRIPT_DIR=$(dirname "$0")

echo "======================"

kubectl apply -f "$SCRIPT_DIR"/DeployV2/kubernetes

echo "The files are being deployed, please wait..."
sleep 10

# Set the desired namespace
NAMESPACE="default"


# Get the list of pods in the namespace
PODS=$(kubectl get pods -n "$NAMESPACE" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')
#DEPLOYMENTS=$(kubectl get deployments -n "$NAMESPACE" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')
#SVC=$(kubectl get services -n "$NAMESPACE" --output=jsonpath='{range .items[*]}{.metadata.name}{"\n"}{end}')

# Directory where the logs will be stored
LOG_DIR="$SCRIPT_DIR/DeployV2/kubernetes/logs/"

# Check if the directory exists
if [ ! -d "$LOG_DIR" ]; then
    mkdir -p "$LOG_DIR"
fi

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
#for service in $SERVICES; do
#    if [[ $service != "kubernetes" ]]; then
#        echo "Deleting service: $service"
#        kubectl delete service "$service" -n "$NAMESPACE"
#    fi
#done

# Loop through each deployment and delete it
#for deployment in $DEPLOYMENTS; do
#    echo "Deleting deployment: $deployment"
#    kubectl delete deployment "$deployment" -n "$NAMESPACE"
#done

