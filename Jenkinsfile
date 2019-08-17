pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				script {
					sh './groovyw ListReposInOrg.groovy'
				    def list = sh script: './groovyw LoadRepos.groovy', returnStdout: true
				    println("$list")
				}
			}
		}
	}
}
