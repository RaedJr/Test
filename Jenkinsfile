pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "Raedjr"
                
            }
        }
        
         stage("clean install"){
            steps{
                bat 'mvn clean install'
            }
        }
        

            stage("clean deploy"){
            steps{
                bat 'mvn deploy'
            }
            }


      
        
         
      
    }
  
}
