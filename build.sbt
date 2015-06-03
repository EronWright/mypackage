// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.10.4"

sparkVersion := "1.3.1"

spName := "eronwright/mypackage"

// Don't forget to set the version
version := "0.0.1"

// All Spark Packages need a license
licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))


// Add Spark components this package depends on, e.g, "mllib", ....
sparkComponents ++= Seq("sql", "mllib")

// uncomment and change the value below to change the directory where your zip artifact will be created
// spDistDirectory := target.value

// add any Spark Package dependencies using spDependencies.
//spDependencies += "databricks/spark-avro:1.0.0"

//spIncludeMaven := true

libraryDependencies += "org.deeplearning4j" % "dl4j-spark" % "0.0.3.3.3.alpha1"


credentials += Credentials(Path.userHome / ".ivy2" / ".spcredentials")