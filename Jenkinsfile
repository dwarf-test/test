node {
	stage('Gather Data') {
		def repoSrc = load 'LoadRepo.groovy'
		def repoList = repoSrc.fetch()
		repoList.each {
			println(it)
			dir(it) {		
			}
		}
	}
}
