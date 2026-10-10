# Harness lab app

Tiny Java 17 / Maven app for the Harness Enterprise SE lab.

- `src/` app (HTTP server on :8080, `/` and `/health`) and unit tests
- `Dockerfile` runs the packaged jar (multi-arch base image)
- `k8s/` Deployment (2 replicas) and Service used by the Harness canary stage

Build and test locally: `mvn clean package`
