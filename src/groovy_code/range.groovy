package groovy_code

def range = ["Groovy","Java"]
println range.class
range.add("Gradle")
range << "Smalltalk"
range[5] = "Python"
println range.size
range.each{
    println it
}

assert range[1] == "Java"

def range2 = 0..4
println range2.class