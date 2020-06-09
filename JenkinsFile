pipeline {
  agent any
  stages {
    stage('Pre-Clean') {
      steps {
        sh 'mvn pre-clean'
      }
    }

    stage('Compile-Code') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('Code-Review') {
      steps {
        sh 'mvn site'
      }
    }

    stage('Testing') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Create-Package') {
      steps {
        sh 'mvn package -DskipTests'
      }
    }

    stage('Publish-Reports') {
      steps {
        script {
          publishHTML(target: [
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: true,
            reportDir: 'reports',
            reportFiles: 'index.html',
            reportTitles: "SimpleCov Report",
            reportName: "SimpleCov Report"
          ])
        }

      }
    }

  }
}
