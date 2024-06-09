def call( DOCKER_USER ,DOCKER_TAGS,  IMAGE_NAME) {
    def dockerfileContent = libraryResource 'next.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    sh 'docker build -t ${DOCKER_USER}/${IMAGE_NAME}:${DOCKER_TAGS} .'
    sh 'docker push ${DOCKER_USER}/${IMAGE_NAME}:${DOCKER_TAGS}'
}