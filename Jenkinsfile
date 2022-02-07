pipeline {
    agent any

    stages {
        stage('build') {
            steps {
               npm install
               sh 'clean build --debug'
            }
        }
    }
}