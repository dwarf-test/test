pipeline {
	agent any

	stages {
		stage('Gather Data') {
			steps {
				list = sh "groovy -t ddae1e41099bb89a636241818107dff969c27695 ListReposInOrg Terasology"
				println(list)
			}
		}
	}
}

