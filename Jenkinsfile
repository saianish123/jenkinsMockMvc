pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
         stage('checkout') {
            steps {
                echo 'Hello checkout'
            }
        }
         stage('package') {
            steps {
               bat 'mvn clean package'
            }
        }
    }
}

