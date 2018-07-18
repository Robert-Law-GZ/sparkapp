package example

import scala.concurrent._, duration._
import core.Weather


object HelloWorld {
  def main(args:Array[String]){
    val w = Await.result(Weather.weather, 10.seconds)
    println(s"Hello! The weather in New York is $w.")
    Weather.http.close()
  }
}
