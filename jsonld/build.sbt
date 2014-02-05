name  := "test"

version  := "1.0-SNAPSHOT"

retrieveManaged := false

scalaVersion := "2.10.2"

compileOrder := CompileOrder.JavaThenScala

resolvers ++= Seq(
        "Typesafe Repository" at "http://repo.typesafe.com/repo/typesafe",
        "Typesafe" at "http://repo.typesafe.com/typesafe/repo",
        "restlet" at "http://maven.restlet.org/",
        "repo.codahale.com" at "http://repo.codahale.com",
        "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/",
        "Sonatype releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

resolvers += "Local Maven Repository" at "file:///"+Path.userHome+"/.m2/repository"


libraryDependencies += "com.github.jsonld-java" % "jsonld-java-jena" % "0.3-SNAPSHOT"

libraryDependencies += "com.github.jsonld-java" % "jsonld-java-sesame" % "0.3-SNAPSHOT"

libraryDependencies += "org.openrdf.sesame" % "sesame-rio-turtle" % "2.7.10"

