pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Run') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="org.example.Main" '
            }
        }
    }
}
