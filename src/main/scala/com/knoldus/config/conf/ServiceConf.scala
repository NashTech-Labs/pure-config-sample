package com.knoldus.config.conf


// Akka config
case class Akka(
                 cluster: Cluster
               )

case class Cluster(
                    seedNodes: Set[String],
                    seedNodeTimeout: String,
                    retryUnsuccessfulJoinAfter: String,
                    shutdownAfterUnsuccessfulJoinSeedNodes: String,
                    downRemovalMargin: String,
                    downingProviderClass: String,
                    quarantineRemovedNodeAfter: String,
                    allowWeaklyUpMembers: String,
                    roles: List[String],
                    runCoordinatedShutdownWhenDown: String,
                    minNrOfMembers: Int,
                    logInfo: String,
                    logInfoVerbose: String,
                    jmx: Jmx
                  )

case class Jmx(enabled: String)

// Service Configuration
case class Port(number: Int) extends AnyVal

sealed trait AuthMethod
case class Login(username: String, password: String) extends AuthMethod
case class Token(token: String) extends AuthMethod
case class PrivateKey(pkFile: java.io.File) extends AuthMethod

case class ServiceConf(
                        host: String,
                        port: Port,
                        useTcp: Boolean,
                        authMethods: List[AuthMethod],
                        akka: Akka
                      )
