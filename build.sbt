name := "sparkscala"
version := "1.0"
scalaVersion :="2.13.8"
val sparkVersion = "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion
libraryDependencies ++= Seq(
"org.apache.spark" % "spark-core_2.11" % "2.3.2",
"org.apache.spark" % "spark-sql_2.11" % "2.3.2",
"org.apache.spark" % "spark-streaming_2.11" % "2.3.2",
"org.apache.spark" % "spark-mllib_2.11" % "2.3.2",
"org.jmockit" % "jmockit" % "1.49" % "test"
)