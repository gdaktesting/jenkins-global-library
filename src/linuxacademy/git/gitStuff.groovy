package linuxacademy.git;

def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD

    // echo ""
    // echo proc.text

    def cmd = 'hostname'
    echo "1"
    def sout = new StringBuffer(), serr = new StringBuffer()
    echo "2"
    def proc = cmd.execute()
    echo "3"
    proc.consumeProcessOutput(sout, serr)
    echo "4"
    proc.waitForOrKill(1000)
    echo "5"
    println sout
    echo "6"
    return "It ran!"
}