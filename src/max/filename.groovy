def checkout(){
  stage('Sanity check') {
    steps {
      input "Does the staging environment look ok?"
    }
  }
}
