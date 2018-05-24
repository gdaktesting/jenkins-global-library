package linuxacademy.git;

def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD
    return "ls -la".execute().text
}