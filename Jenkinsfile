pipeline {
 agent any
   stages{
         stage('get source') {
         steps{
              git 'https://github.com/Mokshithasekhar/JenkinsTestApp.git'
              }
          }
          stage('build apk'){
          steps{
              sh './gradlew clean assembleRelease'
              }
          }
          stage('Stage Archive'){
          steps{
          archiveArtifacts artifacts: 'app/build/outputs/apk/release/*.apk', fingerprint: true
          }
          }
          stage('SonarQube analysis') {
           steps{
                                   withSonarQubeEnv('Sonar1') {
                                                   // requires SonarQube Scanner for Gradle 2.1+
                                                   // It's important to add --info because of SONARJNKNS-281
                                                   sh './gradlew --info sonarqube'
                                                 }

                    }
                    }

      }

    post {
    always {
        emailext body: 'A Test EMail', recipientProviders:
        [[$class: 'DevelopersRecipientProvider'],
        [$class: 'RequesterRecipientProvider']],
        subject: 'Test', to: 'sekhar.android.2011@gmail.com'
    }
}


}