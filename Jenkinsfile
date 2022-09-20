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
                bat 'mvn install'
            }
        }
        

            stage("clean deploy"){
            steps{
                bat 'mvn deploy'
            }
            }


      
        
          stage("sonarquebe analyse"){
            steps{
                bat 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=admin123'
            }
        }
      
    }
  
}
