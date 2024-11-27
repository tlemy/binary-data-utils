pipeline { 
    agent { label 'ted_agent_1' }
    tools {
	maven 'Maven 3.8.8'
	jdk 'Java 21.0.5'
    }
    stages {
	stage('Setup') {
		steps {
			sh 'export MAVEN_HOME=/usr/share/maven'
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
	stage('Deploy') {
		steps {
			sh 'cp ./target/binary-data-utils.jar /opt/binary-data-utils'
			sh 'docker build -t binary-data-utils .'
			sh 'docker images'
			sh 'docker run binary-data-utils'
		}
	}
    }
}
