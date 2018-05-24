package linuxacademy.git;

def gitCommit(gitPath) {

    echo "'${gitPath}'"
    return "/bin/git --git-dir='${gitPath}' rev-parse HEAD".execute().text
}