package groovy_code

def repeat(var){
    for(i=0;i<3;i++){
        println var
    }
}
repeat("hi")
repeat(1)

repeatClosure = { x ->
    for(i in 0..<3){
        println x
    }    
}
repeatClosure("hello")
repeatClosure(5)

def repeateWithTimeArg(val,repeat=5){
    for(i in 0..<repeat){
        println val
    }
}
repeateWithTimeArg("foo")
repeateWithTimeArg("hi",3)