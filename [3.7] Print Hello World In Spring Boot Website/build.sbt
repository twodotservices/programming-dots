name := "[3.7] Print Hello World In Spring Boot Website"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-parent" % "2.1.8.RELEASE" pomOnly(),
  "org.springframework.boot" % "spring-boot-starter-web" % "2.1.8.RELEASE",
  "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.1.8.RELEASE"
)