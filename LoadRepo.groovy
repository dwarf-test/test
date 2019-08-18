#!/usr/bin/env groovy

def run() {
	def repoFile = new File('list.txt').text
	def repoList = repoFile.split(",")
	
	return repoList
}
	
