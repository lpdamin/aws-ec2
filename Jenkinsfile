pipeline {
    agent any

    parameters {
        booleanParam(name: 'deploy', defaultValue: false, description: 'deploy the infra')
        booleanParam(name: 'destroy', defaultValue: false, description: 'Destroy the infra')

    }
    environment {
        AWS_ACCESS_KEY_ID     = credentials('AWS_ACCESS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
    }
    stages {
        stage('checkout') {
            steps {
                checkout scm    
                }
            }
        stage('cdktf-install') {
            steps {
                bat 'npm install --global cdktf-cli@next'
                }
            }
        stage('install-awsprovider') {
            steps {
                 bat 'cdktf help'
                //bat 'cdktf provider add "aws@~>4.0"'
                }
            }
        stage('deploy instance') {
             when {
                equals expected: true, actual: params.deploy
            }
            steps {
                
                bat 'mvn compile'
                bat 'cdktf deploy --auto-approve'
                
            }
            }
        stage('Destroy-instance') {
            when {
                equals expected: true, actual: params.destroy
            }
        
            steps {
            bat 'cdktf destroy --auto-approve'
          }
    }
  }
}