pipeline {
    environment{
        imageName =""
    }
    agent any
    stages {
        stage('Git pull') {
            steps {
                sh 'git clone https://github.com/Dhruv-Kharkwal/Calculator.git'
                sh 'cd Calculator'
            }
        }
        stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker Build to Image') {
            steps {
                script{
                    imageName=docker.build "dhruvkharkwal/spe_miniproject"
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','calc_docker'){
                        imageName.push()
                    }
                }
            }
        }
        stage('Ansible Pull Docker Image') {
            steps {
                ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory',
                 playbook: 'playbook-deploy.yml', sudoUser: null

            }
        }
    }
}
