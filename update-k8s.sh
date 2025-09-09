#!/bin/bash

# ===============================
# Script to update aqi-app-new in Kubernetes locally
# ===============================

# Stop immediately on errors
set -e

# Optional: change local port if 8080 is in use
LOCAL_PORT=8080

# Docker image
IMAGE="ghcr.io/pandeyrr/aqi-app-new:latest"

# Deployment & service names
DEPLOYMENT="aqi-app-new"
SERVICE="aqi-app-new"

echo "Pulling latest Docker image..."
docker pull $IMAGE

echo "Updating Kubernetes deployment..."
kubectl set image deployment/$DEPLOYMENT $DEPLOYMENT=$IMAGE

echo "Waiting for rollout to complete..."
kubectl rollout status deployment/$DEPLOYMENT

echo "Starting port-forward on localhost:$LOCAL_PORT..."
echo "Press Ctrl + C to stop port-forwarding."
kubectl port-forward service/$SERVICE $LOCAL_PORT:80
