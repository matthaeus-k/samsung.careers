pipeline {
    agent any

    stages {
        stage('Gradle Build') {
            steps {
               npm install
               sh 'gradle clean build -x test -b build-server.gradle'
            }
        }
    }
}