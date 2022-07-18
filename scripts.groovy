def build(){
	echo 'building the application'
}

def test(){
	echo 'Testing the application'
}

def deploy(){
	
	echo 'building the application'
	echo "deploying versio ${params.VERSION}"
	
}

return this
