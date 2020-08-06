package com.knoldus.config.conf

import pureconfig.ConfigSource
import pureconfig._
import pureconfig.generic.auto._

object Configuration {

  val serviceConf: ServiceConf = ConfigSource.default.load[ServiceConf] match {
    case Right(conf) => conf
    case Left(error) => throw new Exception(error.toString())
  }

}
