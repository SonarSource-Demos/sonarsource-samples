node {
  env.NODEJS_HOME = "${tool 'Latest'}"
  // on linux / mac
  env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
  
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def scannerHome = tool 'SonarScanner';
    withSonarQubeEnv() {
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}
