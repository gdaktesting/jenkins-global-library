def call(String nodeENV = "NodeJS_8.11.2") {
    env.NODEJS_HOME = "${tool 'NodeJS_8.11.2'}"
    // on linux / mac
    env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
    // on windows
    env.PATH="${env.NODEJS_HOME};${env.PATH}"
    sh 'node --version'
    sh 'npm --version'
    sh 'gulp --version'
}