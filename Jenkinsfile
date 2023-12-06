
pipeline {
    agent any

     tools {
            jdk 'java-17-openjdk.x86_64'
            maven 'maven-3.9.4'
        }

        agent {
    		label('java && maven')
    	}

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
                quarkusUtils.runClean()

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

