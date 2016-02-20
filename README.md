OS X Build: (Travis CI) [![Build Status](https://travis-ci.org/jibijose/eclipse-sbt-plugin.png?branch=master)](https://travis-ci.org/jibijose/eclipse-sbt-plugin)

Windows Build: (Appveyor) [![Build status](https://ci.appveyor.com/api/projects/status/6204kde3kcdgm480)](https://ci.appveyor.com/project/jibijose/eclipse-sbt-plugin)


This project is built using Eclipse Tycho (https://www.eclipse.org/tycho/) and requires at least maven 3.0 (http://maven.apache.org/download.html) to be built via CLI. 
Simply run :

    mvn clean package


Steps to install in eclipse.

* Install sbt in windows/unix
* Install scala-ide plugin in eclipse
* Install sbteclipse https://github.com/typesafehub/sbteclipse  Now sbt eclipse should work from command prompt/shell

This plugin hooks into eclipse and developer can run it from eclipse itself.
https://raw.github.com/jibijose/updatesite/master

* Install new software and with update site or newly build update.zip from this source code
* Edit "Sbt" in preferences page.

Now "sbt eclipse" is invoked automatically to listening to any changes in conf files and will refresh eclipse.
Also you can run any sbt commands from eclipse.


Reference
* http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fextension-points%2Forg_eclipse_ui_preferencePages.html
* https://github.com/vogellacompany/vogella.git
* https://github.com/eclipse/m2e-core.git
* https://github.com/scalastuff/esbt