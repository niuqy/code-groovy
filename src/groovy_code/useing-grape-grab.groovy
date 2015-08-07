package groovy_code

@Grab('commons-io:commons-io:2.4')
import org.apache.commons.io.FilenameUtils

def path = "/home/abner/Tv_density.txt"
println FilenameUtils.getName(path)
println FilenameUtils.getBaseName(path)
println FilenameUtils.getExtension(path)