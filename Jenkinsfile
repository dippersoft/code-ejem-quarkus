
pipeline {
    agent any

    options {
        skipStagesAfterUnstable()
        disableConcurrentBuilds()
        timeout(time: 3, unit: 'MINUTES')
    }


    stages {
        stage('Checkout') {
                steps {

                sh 'java --version'
                     echo 'checkout..'
                }
            }
        stage('Prepare') {
            steps {
                echo 'Prepare..'
                sh "chmod +x mvnw"
                sh './mvnw clean'
                sh './mvnw package'

            }
        }

        stage('Build') {
            steps {
                echo 'Building..'
                sh 'docker build -f src/main/docker/Dockerfile.jvm -t quarkus/code-ejem-quarkus-jvm .'

            }
        }
        stage('Test'){
             steps {
                            echo 'Testing..'
                    }
        }
        stage('Deploy') {
             steps {
                    echo 'Deploying....?'
                    sh 'docker run -d -i --rm -p 8081:8081 quarkus/code-ejem-quarkus-jvm'

                   }
        }
    }
}

