package groovy_code

def hash = [name:"Andy","VPN-#":45,id:23]
hash.put("no",23)
println hash.get("id")
println hash.getClass()
hash.dob = "07/15/15"
println hash.get("dob")
hash.put("3","three")
println hash["3"]