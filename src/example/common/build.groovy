package example.common

def build(){
    println('Running build step')

    try{
        node {
            container('maven:3.8.2-openjdk-17'){
                script.withMaven(maven: 'maven',jdk: java17){
                    script.sh "mvn package source:jar deploy -U"
                }
            }
        }
    }
    catch(ExceptionType e){
        println(e.message)
    }
}