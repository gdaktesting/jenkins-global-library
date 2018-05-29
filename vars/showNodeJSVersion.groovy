def installTools() {
    // Install tools
    def nodePath = tool(name: 'NodeJS_8.11.2')
    def nodeHome = tool(name: 'NodeJS_8.11.2')
    return [
            "PATH+NODE=${nodePath}/bin",
            "NODEJS_HOME=${nodeHome}"
    ]
}

def call(String nodeENV = "NodeJS_8.11.2") {

    node ('CentOS'){
        //env.NODEJS_HOME = "${tool 'NodeJS_8.11.2'}"
        // on linux / mac
        //env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"

        withEnv(installTools()) {

            echo "Path: ${env.PATH}"

            echo "NODEJS_HOME: $env.NODEJS_HOME"

            sh "node --version"
            sh "npm --version"
            sh "gulp --version"

        }
    }

}