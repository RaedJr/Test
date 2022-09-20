pipeline {
    agent any
    
    stages {
        stage('msg'){
            steps{
                echo "RaedJr"
                
            }
        }
        
          stage('sonarquebe analyze'){
            steps{
                sh 'mvn sonar:sonar'
                
            }
        }
      
    }
  
}
