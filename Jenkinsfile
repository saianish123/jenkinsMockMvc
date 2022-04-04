pipeline {
agent any

 stages {
stage('Check out') {
steps {
echo 'Checking out'
}
}
stage('Package') {
steps {
bat 'mvn clean package'
}
}
  stage('sonar analysis') {
steps {
 withSonarQubeEnv('ZensarCodeAnalysis'){
  bat 'mvn sonar:sonar'
 }
}
}
stage('JaCoCo Report') {
steps {
jacoco()
}
}
  stage('Build Docker Image') {
steps {

}
}
  stage('Push Docker Image To Docker Hub') {
steps {

}
}
}
}
