pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "Raed"
                
            }
        }
        
         stage("clean install"){
            steps{
                bat 'mvn clean install'
            }
        }
        

            stage("clean deploy"){
            steps{
                bat 'mvn clean deploy'
            }
            }


      
        
         
      
    }
  
}
