#!/usr/bin/env groovy

def repoList = []
def repoFile = new File('list.txt').eachLine { line ->
	repoList << line
}
println repoList
