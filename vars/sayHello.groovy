def call(String name = 'you') {

    echo "/usr/bin/ls -la".execute.text
    echo "Hello, ${name}"
}