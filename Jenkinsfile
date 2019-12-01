node{
	stage('SCM Checkout'){
		git 'https://github.com/pthapa3/Maven.git'

	}

	stage('Clean-Compile'){
		
	        // Maven installation declared in the Jenkins "Global Tool Configuration"
	        def mvnHOME= tool name: 'Jenkins_Maven', type: 'maven'
	 
	      // Run the maven build
	      sh "${mvnHOME}/bin/mvn clean compile"
	 
	 }
}

