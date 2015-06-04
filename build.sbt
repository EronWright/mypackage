// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html
name := "mypackage"
organization := "EronWright"
version := "0.0.12"

// Scala
scalaVersion := "2.10.4"
crossPaths := false  // suppress the scala version number suffix on artifacts

// DL4J
//libraryDependencies ++= Seq(
//    "org.deeplearning4j" % "dl4j-spark-ml" % "0.0.3.3.4.alpha1-SNAPSHOT",
//    "org.nd4j" % "nd4j-jblas" % "0.0.3.5.5.5-SNAPSHOT"
//)

// Spark Packaging
credentials += Credentials(Path.userHome / ".ivy2" / ".spcredentials")
sparkVersion := "1.4.0"
spName := "EronWright/mypackage"
spIncludeMaven := false
licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

// Add Spark components this package depends on, e.g, "mllib", ....
sparkComponents ++= Seq("sql", "mllib")

// uncomment and change the value below to change the directory where your zip artifact will be created
// spDistDirectory := target.value

// add any Spark Package dependencies using spDependencies.
//spDependencies += "databricks/spark-avro:1.0.0"

// Resolvers
resolvers += Resolver.mavenLocal


