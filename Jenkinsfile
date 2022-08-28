pipeline {
    agent any

    parameters {
        booleanParam(name: 'deploy', defaultValue: false, description: 'deploy the infra')
        booleanParam(name: 'destroy', defaultValue: false, description: 'Destroy the infra')

    }
    stages {
        stage('checkout') {
            steps {
                
                checkout scm
                
            //git "https://github.com/lpdamin/aws-ec2.git"
                    
                    
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
                configFileProvider([configFile(fileId: 'terraform')]) {
                bat 'mvn compile'
                bat 'cdktf deploy --auto-approve'
                }
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