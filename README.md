
# Thread

untuk tugas cloud


## Installation

Setup installation

```bash
    javac -d out src/main/java/org/example/Main.java
    jar -cvf app.jar -C out .
    jar -cvf app.jar out/org/example/Main.class
    docker build --no-cache -t thread_java .
    docker run thread_java
```

    
