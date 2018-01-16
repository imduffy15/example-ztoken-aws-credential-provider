name := "example-ztoken-aws-credential-provider"

version := "0.1"

scalaVersion := "2.12.4"

resolvers ++= Seq(
  Resolver.bintrayRepo("iduffy", "maven")
)

libraryDependencies ++= Seq(
  "software.amazon.awssdk"      %  "s3"                   % "2.0.0-preview-7",
  "com.amazonaws.auth" % "ztoken-aws-credential-provider" % "1.0"
)
