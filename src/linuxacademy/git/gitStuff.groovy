package linuxacademy.git;

def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD

    // echo ""
    // echo proc.text

    def cmd = 'hostname'
    def sout = new StringBuffer(), serr = new StringBuffer()
    def proc = cmd.execute()
    proc.consumeProcessOutput(sout, serr)
    proc.waitForOrKill(1000)
    println sout
    return "It ran!"
}