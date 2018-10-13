package net.martinprobson.spark

object SparkMain extends App {
  val spark = new SparkEnvClass
  spark.versionInfo.foreach(v => println(v))
}
