# Kubernetes Basic Assingment
1. Created one Springboot application that will show list of teachers.
2. API Url for teacher : http://localhost:8084/school/teacher
3. Application is Dockerize and I have created docker images:
   - kritikasingh02/teacher:v3

## Tech Stack:
1. Springboot
2. Docker
3. Kubectl
4. Minikube
5. Helm

## Steps to run the application:

1. Start minikube and verify kubectl 
   > minikube start
   > kubectl cluster-info

2. Create helm chart:
   > helm create teacher-chart

3. Helm install:
   > helm install init-release ./teacher-chart
   ![](images/helm-install.png)
   ![](images/helm-app-run.png)
   ![](images/helm-app-run-2.png)

4. Update Helm:
   ![](images/helm-update.png)

5. Uninstall Helm:
   > helm install init-release ./teacher-chart

6. Helm rollback:
   ![](images/helm-rollback.png)
   
8. Helm with namespace:
   ![](images/namespace1.png)

9. Persistent storage and Persistent storage claim:
    ![](images/pvc.png)
   