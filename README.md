Setup:
/njavac -d out src/main/java/org/example/Main.java
/njar -cvf app.jar out/org/example/Main.class
/ndocker build --no-cache -t thread_java .
/ndocker run thread_java
