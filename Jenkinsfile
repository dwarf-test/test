pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				script {
				    def list = sh script: './groovyw ListReposInOrg.groovy', returnStdout: true
				    println("$list")
				}
			}
		}
	}
}
