def call(body) {

    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    node {
        stage('stage 1') {
            echo "stage 1 ${config.abc}"
        }
        stage('stage 2') {
            echo "statge 2"
        }
    }

}
