pipeline { 
    agent any
    tools {
	maven 'Maven 3.8.8'
	jdk 'Java 21.0.5'
    }
    stages {
	stage('Setup') {
		Steps {
			sh 'export $JENKINS_HOME=${user.home}/Applications/jenkins' 
		}
	}
    	stage('Build') {
    		steps {
    			sh 'mvn clean install -DskipTests=true'
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
    }
}
