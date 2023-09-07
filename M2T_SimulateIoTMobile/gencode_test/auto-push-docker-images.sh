#!/bin/bash

# Configuration variables
#DOCKER_USERNAME="${DOCKER_USERNAME:-$(grep -Po '(?<="username": ")[^"]*' ~/.docker/config.json)}"
#DOCKER_PASSWORD="${DOCKER_PASSWORD:-$(grep -Po '(?<="password": ")[^"]*' ~/.docker/config.json)}"
#DOCKER_REPO="$DOCKER_USERNAME/tfg"

DOCKER_USERNAME="raaulcs"
DOCKER_PASSWORD=""
DOCKER_REPO="raaulcs/tfg"

# Reference date (in YYYY-MM-DD format)
REFERENCE_DATE="2023-06-01"

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
        #docker image rm -f "$IMAGE_ID"
        docker tag "$IMAGE_ID" "$DOCKER_REPO:$IMAGE_NAME"
        docker push "$DOCKER_REPO:$IMAGE_NAME"
    fi
done

# Log out from Docker Hub
docker logout
echo "Push of new images completed."
