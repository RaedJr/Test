pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "RaedJr"
                
            }
        }
        
          stage("Maven Build"){
            steps{
                bat 'mvn clean package'
            }
        }
      
    }
  
}
