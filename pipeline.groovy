pipeline {
    agent any
    stages {

        stage('Run Python Script') {
            steps {
               
                 bat 'python helloworld.py' 
            }
        }
    }
}
