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
                bat 'mvn exec:java -Dexec.mainClass="org.example.Main" '
            }
        }
    }
}
