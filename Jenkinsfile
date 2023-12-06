pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }


    stages {
        stage('Checkout') {
                steps {
                     echo 'checkout..'
                }
            }
        stage('Build') {
            steps {

             sh './mvnw package -Dquarkus.package.type=uber-jar'
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
                            sh './mvnw quarkus:dev'
                   }
        }
    }
}

