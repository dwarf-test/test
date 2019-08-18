#!/usr/bin/env groovy

def load() {
	def repoFile = new File('list.txt').text
	def repoList = repoFile.split(",")
	
	return repoList
}
	
