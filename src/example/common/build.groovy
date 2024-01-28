package example.common

def build(){
    println('Running build step')

    try{
        scriptwithMaven(maven: 'maven',jdk: java17){
            script.sh "mvn package source:jar deploy -U"
        }
    }
}