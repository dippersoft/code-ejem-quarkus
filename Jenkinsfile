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

            sh 'pwd'
             sh 'ls'
             sh 'mvn -v'
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

