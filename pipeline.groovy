pipeline {
    agent any
    stages {

        stage('Run Python Script') {
            steps {
                script{

                 bat 'python helloworld.py' 
                }
               
            }
        }
    }
}
