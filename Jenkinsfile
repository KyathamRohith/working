pipeline {

    agent any

    stages {

        stage('Clone Repository') {
            steps {
                echo 'Cloning repository...'
                git 'https://github.com/KyathamRohith/working.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Starting the build process...'
                sh 'echo "Building the application..."'
            }
        }

        stage('Test') {
            steps {
                echo 'Executing tests...'
                sh 'echo "Running tests..."'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                sh 'echo "Deploying application..."'
            }
        }
    }
}
