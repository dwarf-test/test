def repoSrc

node {
	stage('Load') {
		steps {
			repoSrc = load 'LoadRepo.groovy'
		}	
	}
	stage('Gather Data') {
		steps {
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