package org.k9.git;

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

return this
