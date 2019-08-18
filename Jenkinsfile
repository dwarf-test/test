def repoSrc

node {
	stage('Load') {
		repoSrc = load 'LoadRepo.groovy'
	}
	stage('Gather Data') {
		repoSrc.fetch()
		def repoList = repoSrc.load()
		repoList.each {
			println(it)
			dir(it) {		
			}
		}
	}
}