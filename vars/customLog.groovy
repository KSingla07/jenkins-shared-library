def info(String message){
    sh "echo INFO $message" 
}
def warn(String message){
    sh "echo WARN $message" 
}
def debug(String message){
    sh "echo DEBUG $message" 
}

