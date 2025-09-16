pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn wrapper:wrapper'
                sh './mvnw clean test'
            }
        }
        stage('Publish JUnit Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}

