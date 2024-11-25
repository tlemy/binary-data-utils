pipeline { 
    agent any
    tools {
	maven 'Maven 3.8.8'
	jdk 'Java 21.0.5'
    } 
    stages {
    	stage('Build') {
    		steps {
    			sh 'mvn clean install'
    		}
    	}
	stage('Test') {
		steps {
			sh 'mvn test'
		}
		post {
			junit 'target/surefire-reports/*.xml'
		}
	}
    }
}
