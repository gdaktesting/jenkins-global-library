package linuxacademy.git;

def gitCommit(gitPath) {
    sh "/bin/git --git-dir='${gitPath}' rev-parse HEAD"
}

