package linuxacademy.git;

def gitCommit(gitPath) {
    return "Testing lib" //"/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}