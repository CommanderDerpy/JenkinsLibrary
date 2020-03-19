def checkout()n{
  stage('Sanity check') {
    steps {
      input "Does the staging environment look ok?"
    }
  }
}
