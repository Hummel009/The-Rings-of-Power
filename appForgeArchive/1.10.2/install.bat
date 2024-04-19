@echo off

set JAVA_HOME=Q:\.jdks\temurin-1.8.0_412
set PATH=.;%JAVA_HOME%\bin;%PATH%

java -version

gradlew setupDecompWorkspace idea

set JAVA_HOME=Q:\.jdks\temurin-21.0.3
set PATH=.;%JAVA_HOME%\bin;%PATH%

endlocal