pipeline {
    agent any

    environment {
        JAVA_HOME = '/usr/lib/jvm/java-11-openjdk'
        PATH = "$JAVA_HOME/bin:$PATH"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/yourusername/yourrepository.git'
            }
        }

        stage('Build and Run') {
            steps {
                script {
                    // Compile the Java code
                    sh 'javac Palindrome.java'
                    
                    // Run the Java program
                    sh 'java Palindrome'
                }
            }
        }
    }

    post {
        always {
            echo 'Cleaning up the workspace'
            cleanWs()
        }
    }
}
