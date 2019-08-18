def repoSrc

pipeline {
	agent any

	stages {
		stage('Load') {
			steps {
				repoSrc = load 'LoadRepo.groovy'		
			}	
		}
		stage('Gather Data') {
			steps {
				script {
					sh './groovyw ListReposInOrg.groovy'
					def repoList = repoSrc.run()
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
