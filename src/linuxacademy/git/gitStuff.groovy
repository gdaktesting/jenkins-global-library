package linuxacademy.git;

def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD

    // echo ""
    // echo proc.text

    "ls -la".execute().text
}

return this