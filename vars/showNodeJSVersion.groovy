def call(String nodeENV = "NodeJS_8.11.2") {

    sh "node --version"
    sh "npm --version"
    sh "gulp --version"
}