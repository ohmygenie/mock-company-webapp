pipeline {
    agent any  // This means the pipeline can run on any available agent

    stages {
        // Build stage
        stage('Build') {
            steps {
                // TODO: Any relevant code or setup before the build can be placed here
                sh './gradlew assemble' // This will run the Gradle assemble task
            }
        }

        // Test stage
        stage('Test') {
            steps {
                // TODO: Any relevant code or setup before the test can be placed here
                sh './gradlew test' // This will run the Gradle test task
            }
        }
    }
}