package example.common

def build(){
    println('Running build step')

    try{
        container("maven"){
            scriptwithMaven(maven: 'maven',jdk: java17){
                script.sh "mvn package source:jar deploy -U"
        }
        }
        
    }
}