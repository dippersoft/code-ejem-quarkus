pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }


    stages {
        stage('Checkout') {
                steps {
                sh 'java --version'
                     echo 'checkout..'
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
                            sh './mvnw compile quarkus:dev'
                   }
        }
    }
}

