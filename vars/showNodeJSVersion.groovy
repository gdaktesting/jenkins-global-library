def call(String nodeENV = "NodeJS_8.11.2") {
    env.NODEJS_HOME = "${tool 'NodeJS_8.11.2'}"
    // on linux / mac
    env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
    // on windows
    env.PATH="${env.NODEJS_HOME};${env.PATH}"

    echo "env.NODEJS_HOME: ${env.NODEJS_HOME}"
    echo "env.PATH: ${env.PATH}"
    sh "${env.NODEJS_HOME}/bin/node --version"
    sh "${env.NODEJS_HOME}/bin/npm --version"
    sh "${env.NODEJS_HOME}/bin/gulp --version"
}