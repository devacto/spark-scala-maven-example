package net.martinprobson.spark

object SparkMain extends App {
  val spark = new SparkEnvClass
  spark.versionInfo.map(v => println(v))
}
