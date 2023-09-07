#!/bin/bash

# Get the directory path of the script
SCRIPT_DIR=$(dirname "$0")

# Configuration variables
#DOCKER_USERNAME="${DOCKER_USERNAME:-$(grep -Po '(?<="username": ")[^"]*' ~/.docker/config.json)}"
#DOCKER_PASSWORD="${DOCKER_PASSWORD:-$(grep -Po '(?<="password": ")[^"]*' ~/.docker/config.json)}"
#DOCKER_REPO="$DOCKER_USERNAME/tfg"

DOCKER_USERNAME="raaulcs"
DOCKER_PASSWORD=""
DOCKER_REPO="raaulcs/tfg"

# Reference date (in YYYY-MM-DD format)
REFERENCE_DATE="2023-08-14"

# Log in to Docker Hub
echo "Logging in to Docker Hub..."
docker login --username "$DOCKER_USERNAME" --password "$DOCKER_PASSWORD"

# Push new images (created after the reference date)
for IMAGE in $(docker image ls --format "{{.ID}}:{{.Repository}}:{{.Tag}}:{{.CreatedAt}}" | cut -d' ' -f1); do
    IMAGE_ID=$(echo "$IMAGE" | cut -d':' -f1)
    IMAGE_INFO=$(echo "$IMAGE" | cut -d':' -f2-)
    IMAGE_NAME=$(echo "$IMAGE_INFO" | cut -d':' -f2 | cut -d'/' -f2)
    CREATED_AT=$(echo "$IMAGE_INFO" | cut -d':' -f4)
    if [[ $CREATED_AT > $REFERENCE_DATE ]]; then
        echo "Tagging and pushing the image: $IMAGE_ID"
        docker tag "$IMAGE_ID" "$DOCKER_REPO:$IMAGE_NAME"
        docker push "$DOCKER_REPO:$IMAGE_NAME"
		#docker image rm -f "$IMAGE_ID"
    fi
done

# Log out from Docker Hub
#docker logout
echo "Push of new images completed."

# Make the other script executable
chmod +x "$SCRIPT_DIR"/kubernetes-script.sh

# Prompt the user with a yes/no question
read -p "Do you want to deploy to Kubernetes? (y/n): " choice

# Convert the choice to lowercase for case-insensitive comparison
choice=${choice,,}

# Check the user's response
if [[ "$choice" == "y" || "$choice" == "yes" ]]; then
    echo "Proceeding to deploy..."
	"$SCRIPT_DIR"/kubernetes-script.sh
elif [[ "$choice" == "n" || "$choice" == "no" ]]; then
    echo "You can execute kubernetes-script.sh at anytime."
else
    echo "Invalid choice. Please enter 'y' or 'n'."
fi
