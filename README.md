# engineering-playbook
engineering-playbook


## Run the Java program only (using Maven)

This repository now includes a minimal Maven setup to compile and run the Java program.

- Compile only (skip tests):

```powershell
mvn -DskipTests compile
java -cp target\classes com.engineering.playbook.App
```

- Run directly with Maven exec plugin (no tests):

```powershell
mvn -DskipTests exec:java -Dexec.mainClass=com.engineering.playbook.App
```

- Package and run the jar (skip tests):

```powershell
mvn -DskipTests package
java -cp target\classes com.engineering.playbook.App
```
