# Prerequisites
Must install the following prerequisites


## Java JDK recommended (release 13 or higher)
The OpenJDK can be installed from [AdoptOpenJDK](https://adoptopenjdk.net)

For portable installation make sure to have the **JAVA_HOME** enviroments variable
and **JAVA_HOME**/bin into **PATH**.

If the java version is changed it must be updated into pom.xml

```xml
...
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.8.1</version>
  <configuration>
    <!-- The java release version must be updated here -->
    <release>13</release>
    <excludes>
      <exclude>.history/**</exclude>
    </excludes>
  </configuration>
</plugin>
...
```

## Apache Maven (recommended 3.6.3 or higher)
The Apache Maven can be installed from [Apache Maven Home](http://maven.apache.org)

For portable installation make sure to have the **MAVEN_HOME** enviroments variable
and **MAVEN_HOME**/bin into **PATH**.

## Node JS (recommended release 12 or higher)
The NodeJS binary can be installed from [NodeJS Home](https://nodejs.org/en/)

For portable installation make sure to have the **/path/to/node_home** into **PATH**.


# Installation
If the prerequisites are done then execute the following command

```bash
npm install
```

# Start Dev Server
The development server

```bash
# All OS
npm start
```

you can use os-depent script

```bash
# Unix
npm start:unix
# Windows
npm start:win
```
