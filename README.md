pipeline {
agent any
stages {
stage('Clone Repository') {
steps {
git 'https://github.com/your-repo/java-webapp.git'
}
}
stage('Build') {
steps {
sh 'mvn clean package'
}
}
stage('Test') {
steps {
sh 'mvn test'
}
}
stage('Deploy to Tomcat') {
steps {
sh 'scp target/*.war user@server:/var/lib/tomcat/webapps/'
}
}
}
}
Solution:
Automates the build and testing process.
Deploys the .war file to Tomcat for continuous delivery.
Can be scheduled to trigger on code changes.
