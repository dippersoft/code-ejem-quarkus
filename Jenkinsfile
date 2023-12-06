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

            sh 'mvn package -Dquarkus.package.type=uber-jar'
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
                   }
        }
    }
}

