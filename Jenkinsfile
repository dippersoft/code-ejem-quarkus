
pipeline {
    agent any

    options {
        skipStagesAfterUnstable()
        disableConcurrentBuilds()
        timeout(time: 15, unit: 'MINUTES')
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
                   }
        }
    }
}

