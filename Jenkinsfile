pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				script {
					sh './groovyw ListReposInOrg.groovy'
				    def repoList = []
					def repoFile = new File('./list.txt')
					repoFile.eachLine { line ->
						repoList << line
					}
			    	repoList.each { repo ->
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
