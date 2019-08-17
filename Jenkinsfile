pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				script {
					sh './groovyw ListReposInOrg.groovy'
				    def repoList = sh script: './groovyw LoadRepos.groovy', returnStdout: true
			    	reposList.each { repo ->
						println(repo)
						dir(repo) {
							sh "pwd"		
						}
					}
				}
			}
		}
	}
}
