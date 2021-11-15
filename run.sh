#!/bin/sh

 javac -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:.  --module-path . \
    --add-modules javafx.controls  -Xlint \
     TreeNode.java MorseCodeConverter.java MorseCodeTree.java MorseCodeConverter_GFA_Test.java MorseCodeConverterTest.java  MorseCodeConverterStudentTest.java 

# java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore MorseCodeConverter_GFA_Test
java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore MorseCodeConverterTest

java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore MorseCodeConverterStudentTest
#export PATH_TO_FX=./javafx
#javac --module-path $PATH_TO_FX --add-modules javafx.controls CourseDBGUI.java
# javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml CourseDBGUI.java
#java --module-path $PATH_TO_FX --add-modules javafx.controls CourseDBGUI