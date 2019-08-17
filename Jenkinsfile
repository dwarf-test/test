pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				list = sh (
					script: "groovy ListReposInOrg.groovy",
					returnStdout: true
				).trim()
				println("$list")
			}
		}
	}
}

