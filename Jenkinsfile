pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "RaedJr"
                
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
      
        
          stage("sonarquebe analyse"){
            steps{
                bat 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=admin123'
            }
        }
      
    }
  
}
