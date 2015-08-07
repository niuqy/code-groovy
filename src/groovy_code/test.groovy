package groovy_code

new File('text.txt').eachLine { line ->
    println line
    }
    
def hello = { who ->
    println "hi,${who}"
    }
hello("Groovy!")    

def max = {x,y ->
    x > y ? x : y
    }
max(3,1)        

def stats = new File('stats.log')
stats.withWriter {
    println it.class.name
    println it instanceof BufferedWriter
    println it instanceof Writer
    }
stats.withWriter { writer ->
    (1..10).each {
    writer << "${it},"   
    }
 } 
    
new File('stats.log').eachLine { line ->
    println line
    }    
    
c = { it*3 }  
c.call('run')

d = { e = { 2*it}; 3*e(it) }
d(5)

toTriple = {n -> 3*n}
runTwice = { a -> toTriple(toTriple(a)) }
println runTwice(2)

def times = {x -> { y -> x*y} }
times(3)(4)
times.call(2)(3)