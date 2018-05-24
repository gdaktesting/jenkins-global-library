package linuxacademy.git;

def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD
    println '/usr/bin/ls'.execute().text
    // echo ""
    // echo proc.text
    return "It ran!"
}