
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
                sh './mvnw package'
                sh 'docker build -f src/main/docker/Dockerfile.jvm -t quarkus/code-ejem-quarkus-jvm .'
               // sh 'docker run -d -i --rm -p 8081:8081 quarkus/code-ejem-quarkus-jvm'
                //sh "./mvnw package"
                //sh "java -jar target/quarkus-app/quarkus-run.jar"


            }
        }

        stage('Build') {
            steps {
                echo 'Building..'

            // sh './mvnw package -Dquarkus.package.type=uber-jar'
             //sh './mvnw package -Dnative -Dquarkus.native.container-build=true'
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
                            //sh './mvnw compile quarkus:dev'
                             sh "./mvnw compile quarkus:dev"
                   }
        }
    }
}

