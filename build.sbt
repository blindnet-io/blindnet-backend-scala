ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.1"

Test / fork := true

val circeVersion = "0.15.0-SNAPSHOT"
val doobieVersion = "1.0.0-RC1"
val http4sVersion = "0.23.11"

lazy val root = (project in file("."))
  .settings(
    name := "blindnet-backend-scala",
    idePackagePrefix := Some("io.blindnet.backend"),
    libraryDependencies ++= Seq(
      "com.dimafeng"           %% "testcontainers-scala-scalatest"  % "0.40.4" % Test,
      "com.dimafeng"           %% "testcontainers-scala-postgresql" % "0.40.4" % Test,
      "com.github.jwt-scala"   %% "jwt-circe"                       % "9.0.5",
      "io.circe"               %% "circe-core"                      % circeVersion,
      "io.circe"               %% "circe-generic"                   % circeVersion,
      "io.circe"               %% "circe-literal"                   % circeVersion % Test,
      "org.apache.commons"     %  "commons-lang3"                   % "3.12.0" % Test,
      "org.bouncycastle"       %  "bcprov-jdk15on"                  % "1.70",
      "org.flywaydb"           %  "flyway-core"                     % "8.5.4",
      "org.http4s"             %% "http4s-blaze-server"             % http4sVersion,
      "org.http4s"             %% "http4s-circe"                    % http4sVersion,
      "org.http4s"             %% "http4s-dsl"                      % http4sVersion,
      "org.scalatest"          %% "scalatest"                       % "3.2.11" % Test,
      "org.slf4j"              %  "slf4j-simple"                    % "1.7.36",
      "org.tpolecat"           %% "doobie-core"                     % doobieVersion,
      "org.tpolecat"           %% "doobie-hikari"                   % doobieVersion,
      "org.tpolecat"           %% "doobie-postgres"                 % doobieVersion,
      "org.typelevel"          %% "cats-effect"                     % "3.3.8",
      "org.typelevel"          %% "cats-effect-testing-scalatest"   % "1.4.0" % Test,
      "org.typelevel"          %% "log4cats-slf4j"                  % "2.2.0",
    )
  )
