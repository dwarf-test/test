#!/usr/bin/env groovy

def repoList = []
def repoFile = new File('list.txt')
repoFile.eachLine { line ->
	repoList << line
}
println(repoFile.text)
