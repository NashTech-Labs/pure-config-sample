package com.knoldus.config.app

import com.knoldus.config.conf.Configuration

object SampleApplication extends App {

  val config = Configuration.serviceConf
  println("Application configuration....... " + config)

}
