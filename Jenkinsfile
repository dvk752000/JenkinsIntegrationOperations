pipeline {
    agent any
    
    environment {
		HTTP_CREDENTIALS=credentials('jenkinssbCredentials')
	}

    stages {
    
		stage('Update the Database'){
			steps{
				script{
					//def isURLReachable = sh(script: "curl -s --retry-connrefused --retry 10 --retry-delay 5 http://192.168.0.101:8081/locations || true", returnStdout: true).trim()
					def response = httpRequest authentication: 'jenkinssbCredentials', url: "http://192.168.0.104:8081/locationsUpdate/${primaryKey}/${updatedValue}"
				}
			}
		}
    }
}

/*
def executeHttpGet(apiUrl, token){
    echo "Executing GitHub API Call, ${apiUrl}"
    def response = httpRequest url: apiUrl, authentication: "${token}"
    if (response.status != 200) {
        echo "API call failed, ${apiUrl}"
        error("Unable to execute API call, StatusCode=${response.status}, Content=${response.content}")
    } else {
        echo "API call success, ${apiUrl}"
        return response
    }
}
*/