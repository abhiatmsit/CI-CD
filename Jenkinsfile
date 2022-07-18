pipeline {
	agent any
	parameters {
		// string(name:'VERSION', defaultValue:'',description:'version to deploy on prod')
		choice(name:'VERSION', choices:['1.1.1','1.1.2','1.1.3'], description:'')
		booleanParam(name:'executeTests', defaultValue:true, description:'')
	}
	stages {
		stage("build"){
			steps {
				echo 'building application'
			}
		}
		stage("test"){
			when {
				expression {
					params.executeTests
				}
			}
			steps {
				echo 'testing the application'
			}
		}
		stage("deploy"){
			steps {
				echo "deploying version ${params.VERSION}"
			}
			
		}
	}
}
