pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "Raed1"
                
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
