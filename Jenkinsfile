node{
	stage('SCM Checkout'){
		git 'https://github.com/pthapa3/Maven.git'

	}

	stage('Clean-Compile'){
		def mvnHOME=tool 'M3'
		sh '${mvnHOME}/bin/mvn clean compile'
	
	}



}
