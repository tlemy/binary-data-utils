pipeline { 
    agent ted_agent
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
			sh 'mkdir -p /opt/binary-data-utils'
			sh 'cp ./target/binary-data-utils.jar /opt/binary-data-utils'
			sh './deploy.sh'
		}
	}
    }
}
