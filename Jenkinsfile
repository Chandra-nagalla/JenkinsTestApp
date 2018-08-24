node {
         stage('get source') {
              git 'https://github.com/Mokshithasekhar/JenkinsTestApp.git'
          }
          stage('build apk'){
              sh './gradlew clean assembleRelease'
          }
          stage('Stage Archive'){
          archiveArtifacts artifacts: 'app/build/outputs/apk/release/*.apk', fingerprint: true
          }

}