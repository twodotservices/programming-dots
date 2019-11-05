package in._2dots

println "Hello World"

String inputfilePath = "/home/abhijit/Downloads/wiki-snapshot.pdf"
String outputfilePath = "/home/abhijit/Downloads/GroovyFiles/outputfile.pdf"
File inputFile = new File(inputfilePath)

if (inputFile.size() > 1024000) {
    def reader = inputFile.newInputStream()
    def outputFile = new File(outputfilePath)
    outputFile.append(reader)
    reader.close()
    println "more than 1mb so downloaded in path directory "
} else println "File size less than 1 mb"