Spring boot multi-module maven project example

https://howtodoinjava.com/spring-boot2/sb-multi-module-maven-project/

mvn archetype:generate -DgroupId=com.studia -DartifactId=Sandre-ear  -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
mvn archetype:generate -DgroupId=com.studia -DartifactId=Sandre-service -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false   (pour générer un module avec un packaging jar)
mvn archetype:generate -DgroupId=com.studia -DartifactId=Sandre-rws -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
