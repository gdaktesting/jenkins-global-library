package linuxacademy.git;

def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD
    def proc = "ls".execute()
    echo "It ran!"
    echo proc.text
    return proc.text
}