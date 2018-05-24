package linuxacademy.git;

def gitCommit(gitPath) {
    def output = sh script: "/bin/git --git-dir='${gitPath}' rev-parse HEAD", returnStdout: true
    return output
}

