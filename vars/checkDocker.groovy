def call(){
    node {
        sh '''
            docker version
        '''
    }
}
