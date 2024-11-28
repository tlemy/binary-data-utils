pipeline { 
    agent { label 'ted_agent_1' }
    tools {
	maven 'Maven 3.8.8'
	jdk 'Java 21.0.5'
    }
    stages {
    	stage('Build') {
    		steps {
    			sh 'mvn clean package -DskipTests=true'
    		}
    	}
	stage('Test') {
		steps {
			sh 'mvn test'
		}
		post {
			always {
				junit 'target/surefire-reports/*.xml'
			}
		}
	}
	stage('Deploy') {
		steps {
			sh './deploy.sh'
		}
	}
    }
}
