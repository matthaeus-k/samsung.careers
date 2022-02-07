pipeline {
    agent any

    stages {
        stage('build') {
            steps {
               npm install
               sh 'gradle clean build'
            }
        }
    }
}