pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				script {
					sh './groovyw ListReposInOrg.groovy'
					def repoList = sh script: './groovyw LoadRepo.groovy', returnStdout: true
					repoList.split(" ")
			    		repoList.each {
						println(it)
						dir(it) {		
						}
					}
				}
			}
		}
	}
}
