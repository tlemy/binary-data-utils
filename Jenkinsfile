pipeline { 
    agent any
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
			sh 'docker build -t binary-data-utils .'
			sh 'docker images'
			sh 'docker run -d -p 8081:8081 binary-data-utils'
		}
	}
    }
}
