pipeline {
    agent any
    stages {

        stage('Run Python Script') {
            steps {
                Script{

                 bat 'python helloworld.py' 
                }
               
            }
        }
    }
}
