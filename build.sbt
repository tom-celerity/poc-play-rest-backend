name := "poc-play-rest-backend"

version := "1.3-SNAPSHOT"

libraryDependencies ++= Seq(
  javaCore,
  javaJdbc,
  javaJpa,
  "mysql" % "mysql-connector-java" % "5.1.25",
  "org.hibernate" % "hibernate-entitymanager" % "4.2.1.Final",
  "org.mockito" % "mockito-all" % "1.9.5" % "test",
  "com.jayway.restassured" % "rest-assured" % "1.8.1" % "test" withSources(),
  "com.intellij" % "annotations" % "5.1",
  "javax.mail" % "mail" % "1.4.7",
  "com.google.inject" % "guice" % "4.0-beta"
  )

play.Project.playJavaSettings

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "appInfos"
