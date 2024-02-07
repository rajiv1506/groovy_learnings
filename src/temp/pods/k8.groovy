package temp.pods

def k8(){
    return """
    apiVersion: v1
    kind: Pod
    metadata:
      labels:
        some-label: myapp
    spec:
      containers:
      - name: maven
        image: maven:3.8.1-jdk-8
        command:
        - cat
        tty: true
    """
}