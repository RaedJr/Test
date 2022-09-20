pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "Raedajr"
                
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
