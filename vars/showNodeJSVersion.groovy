def installTools() {
    // Install tools
    def nodeHome = tool(name: 'Node')
    return [
            "PATH+NODE=${nodeHome}/bin",
    ]
}

def call(String nodeENV = "NodeJS_8.11.2") {

    node ('CentOS'){
        //env.NODEJS_HOME = "${tool 'NodeJS_8.11.2'}"
        // on linux / mac
        //env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"

        withEnv(installTools()) {

            sh "node --version"
            sh "npm --version"
            sh "gulp --version"

        }
    }

}