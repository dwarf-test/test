def repoSrc

pipeline {
	agent any

	stages {
		stage('Load') {
			steps {
				script {
					repoSrc = load 'LoadRepo.groovy'	
				}	
			}	
		}
		stage('Gather Data') {
			steps {
				script {
					repoSrc.fetch()
					def repoList = repoSrc.load()
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
