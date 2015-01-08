# sbt-inner-java
Project demonstrating an issue with mixed-mode compilation in sbt

`sbt compile`:

```
[error] /Users/chrisl/Desktop/innerfoo/sbt-inner-java/src/main/java/Prob.java:10: reference to Prob is ambiguous;
[error] it is both defined in package <empty> and imported subsequently by 
[error] import Prob._
[error]     public Prob.Inner foo(java.util.List<Prob.Inner> list) {
[error]            ^
[error] /Users/chrisl/Desktop/innerfoo/sbt-inner-java/src/main/java/Prob.java:10: reference to Prob is ambiguous;
[error] it is both defined in package <empty> and imported subsequently by 
[error] import Prob._
[error]     public Prob.Inner foo(java.util.List<Prob.Inner> list) {
[error]                                          ^
[error] two errors found
[error] (compile:compile) Compilation failed
[error] Total time: 1 s, completed Jan 8, 2015 2:39:53 PM
```
