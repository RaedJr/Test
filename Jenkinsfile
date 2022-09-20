pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "RaedJr"
                
            }
        }
        
         stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
         }
      
    }
  
}
