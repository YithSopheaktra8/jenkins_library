def call() {
    def dockerfileContent = libraryResource 'springapi.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    // sh 'docker build -t myapp:latest .'
}