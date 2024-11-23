# GitHub User Activity

## Description
**GitHub User Activity** use the GitHub API to retrieve the activity of a user. 
This project is part of the [Roadmap.sh](https://roadmap.sh/projects/github-user-activity) backend projects.

## Requirements
Before compiling and running the program, make sure you have the following installed:

- **Java Development Kit (JDK)** 19 or higher. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Apache Maven** 3.6.0 or higher. You can download it from [here](https://maven.apache.org/download.cgi).


To check that you have Java and Maven installed, you can run the following commands in your terminal:
```bash
java -version
mvn -version

```

## Compilation

To compile the program, navigate to the project's root directory and run the following command:

```bash
mvn clean package
```

This command will compile the program and create a JAR file in the `target` directory.

## Running the Program

To run the program, navigate to the `target` directory and run the following command:

```bash
 java "-DpropertyFile={path_to_properties}" -jar .\GitHubUserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar {username}
```
You must provide a valid GitHub username as an argument to the program and a properties file with the following properties:
```properties

# GitHub API URL
github.token=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
# log level (optional) (options: trace, debug, info, warn, error)
# default: info
log.level=debug
```

if you want to simplify execution, you can create a shell script file with the following content:

### Linux or MacOS

Create a file named `task-cli` with the following content:

```bash
#!/bin/bash

# Configuration of the JAR file and properties file
JAR_PATH="GitHubUserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar"
PROPERTIES_FILE="application.properties"


if [ "$#" -lt 1 ]; then
    echo "Usage: github-activity <arg>"
    exit 1
fi


ARG=$1

java -Dproperty.file=$PROPERTIES_FILE -jar $JAR_PATH $ARG

```
Give the file execution permissions:

```bash
chmod +x github-activity
```

Move the file to a directory in your PATH, for example `/usr/local/bin`:

```bash
sudo mv github-activity /usr/local/bin
```

Now you can run the program by typing `github-activity` in your terminal:

```bash
github-activity Teldavega
```

Create a batch file with the following content:
### Windows
```bash
@echo off

set JAR_PATH=GitHubUserActivity-1.0-SNAPSHOT-jar-with-dependencies.jar
set PROPERTIES_FILE=application.properties

if "%~1"=="" (
    echo Usage: github-activity ^<arg^>
    exit /b 1
)

set ARG=%~1

java -Dproperty.file=%PROPERTIES_FILE% -jar %JAR_PATH% %ARG%

```

Save the file as `github-activity.bat` and move it to a directory in your PATH.

Now you can run the program by typing `github-activity` in your terminal:

```bash
github-activity Teldavega
```

## Usage

You must have a valid github token to interact with the GitHub API. You can create a token by following the instructions [here](https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token).

The program simply fetch the activity of a user and display it in the console.

```bash
## Example
github-activity Teldavega

Starting application
Getting events of Teldavega
-------------------------
RESPONSE CODE:200 OK
-------------------------

User events:
1 repositories changed from private to public in TelDavega/TaskManagerCLI
1 commits pushed in TelDavega/TaskManagerCLI
```
