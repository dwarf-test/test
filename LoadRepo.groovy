#!/usr/bin/env groovy
package org.kohsuke.github
@Grab(group='org.kohsuke', module='github-api', version='1.75')
import org.kohsuke.github.GitHub

def fetch() {
	def repos = []
	def org = 'Terasology';
	def githubCom = GitHub.connectUsingOAuth('ddae1e41099bb89a636241818107dff969c27695');
	def repoList = new File('list.txt')

	githubCom.getOrganization(org).listRepositories().each {
		repoList.append(it.getName() + ",")
	}
}

def load() {
	def repoFile = new File('list.txt').text
	def repoList = repoFile.split(",")
	
	return repoList
}

return this
