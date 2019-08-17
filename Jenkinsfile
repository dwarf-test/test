def loop(repoList) {
	reposList.each { repo ->
		println(repo)
		dir(repo) {
			sh "pwd"		
		}
	}
}

pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				script {
					sh 'rm list.txt'
					sh './groovyw ListReposInOrg.groovy'
				    def repoList = sh script: './groovyw LoadRepos.groovy', returnStdout: true
				    loop(repoList)
				}
			}
		}
	}
}
