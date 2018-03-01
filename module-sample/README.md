# module sample

```
lwk@qwfys ~/Public/project/io/spring/sts/ws/java9-sample/module-sample $ mvn clean install
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] module-sample
[INFO] service-sort
[INFO] service-sort-bubble
[INFO] service-sort-merge
[INFO] consumer-sample
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building module-sample 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ module-sample ---
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ module-sample ---
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/pom.xml to /home/lwk/.m2/repository/org/qwfys/sample/java9/module-sample/0.0.1-SNAPSHOT/module-sample-0.0.1-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building service-sort 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ service-sort ---
[INFO] Deleting /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ service-sort ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ service-sort ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ service-sort ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ service-sort ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ service-sort ---
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ service-sort ---
[INFO] Building jar: /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort/target/service-sort.jar
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ service-sort ---
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort/target/service-sort.jar to /home/lwk/.m2/repository/org/qwfys/sample/java9/service-sort/0.0.1-SNAPSHOT/service-sort-0.0.1-SNAPSHOT.jar
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort/pom.xml to /home/lwk/.m2/repository/org/qwfys/sample/java9/service-sort/0.0.1-SNAPSHOT/service-sort-0.0.1-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building service-sort-bubble 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ service-sort-bubble ---
[INFO] Deleting /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ service-sort-bubble ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ service-sort-bubble ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/target/classes
[INFO] /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/src/main/java/sort/impl/bubble/BubbleSort.java: /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/src/main/java/sort/impl/bubble/BubbleSort.java uses unchecked or unsafe operations.
[INFO] /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/src/main/java/sort/impl/bubble/BubbleSort.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ service-sort-bubble ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ service-sort-bubble ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ service-sort-bubble ---
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ service-sort-bubble ---
[INFO] Building jar: /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/target/service-sort-bubble.jar
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ service-sort-bubble ---
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/target/service-sort-bubble.jar to /home/lwk/.m2/repository/org/qwfys/sample/java9/service-sort-bubble/0.0.1-SNAPSHOT/service-sort-bubble-0.0.1-SNAPSHOT.jar
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-bubble/pom.xml to /home/lwk/.m2/repository/org/qwfys/sample/java9/service-sort-bubble/0.0.1-SNAPSHOT/service-sort-bubble-0.0.1-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building service-sort-merge 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ service-sort-merge ---
[INFO] Deleting /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ service-sort-merge ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ service-sort-merge ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/target/classes
[INFO] /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/src/main/java/sort/impl/merge/MergeSort.java: /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/src/main/java/sort/impl/merge/MergeSort.java uses unchecked or unsafe operations.
[INFO] /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/src/main/java/sort/impl/merge/MergeSort.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ service-sort-merge ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ service-sort-merge ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ service-sort-merge ---
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ service-sort-merge ---
[INFO] Building jar: /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/target/service-sort-merge.jar
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ service-sort-merge ---
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/target/service-sort-merge.jar to /home/lwk/.m2/repository/org/qwfys/sample/java9/service-sort-merge/0.0.1-SNAPSHOT/service-sort-merge-0.0.1-SNAPSHOT.jar
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/service-sort-merge/pom.xml to /home/lwk/.m2/repository/org/qwfys/sample/java9/service-sort-merge/0.0.1-SNAPSHOT/service-sort-merge-0.0.1-SNAPSHOT.pom
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building consumer-sample 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ consumer-sample ---
[INFO] Deleting /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/consumer-sample/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ consumer-sample ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ consumer-sample ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/consumer-sample/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ consumer-sample ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ consumer-sample ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.17:test (default-test) @ consumer-sample ---
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ consumer-sample ---
[INFO] Building jar: /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/consumer-sample/target/consumer-sample.jar
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ consumer-sample ---
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/consumer-sample/target/consumer-sample.jar to /home/lwk/.m2/repository/org/qwfys/sample/java9/consumer-sample/0.0.1-SNAPSHOT/consumer-sample-0.0.1-SNAPSHOT.jar
[INFO] Installing /home/lwk/Public/project/io/spring/sts/ws/java9-sample/module-sample/consumer-sample/pom.xml to /home/lwk/.m2/repository/org/qwfys/sample/java9/consumer-sample/0.0.1-SNAPSHOT/consumer-sample-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO] 
[INFO] module-sample ...................................... SUCCESS [  0.223 s]
[INFO] service-sort ....................................... SUCCESS [  1.057 s]
[INFO] service-sort-bubble ................................ SUCCESS [  0.167 s]
[INFO] service-sort-merge ................................. SUCCESS [  0.103 s]
[INFO] consumer-sample .................................... SUCCESS [  0.105 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.770 s
[INFO] Finished at: 2018-03-02T03:01:50+08:00
[INFO] Final Memory: 22M/73M
[INFO] ------------------------------------------------------------------------
lwk@qwfys ~/Public/project/io/spring/sts/ws/java9-sample/module-sample $ java --module-path consumer-sample/target/consumer-sample.jar:service-sort/target/service-sort.jar:service-sort-bubble/target/service-sort-bubble.jar --module consumer/org.qwfys.sample.consumer.Main
sort service consumer started.
use BubbleSort
[2, 3, 5, 8, 10]
finish
lwk@qwfys ~/Public/project/io/spring/sts/ws/java9-sample/module-sample $ 

```