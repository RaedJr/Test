pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "Raedd"
                
            }
        }
        
         stage("clean install"){
            steps{
                bat 'mvn install'
            }
        }
        

            stage("clean deploy"){
            steps{
                bat 'mvn clean deploy'
            }
            }


      
        
         
      
    }
  
}
