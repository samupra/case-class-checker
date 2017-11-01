# CaseClassChecker
Macro implementation to check if something is case class at compile time

Currently, no maven central dependency available, so I suggest to clone this repo and run
```
     sbt publish-local
```

Then, To use this library, simply do

```
    import com.net.samupra.macros.caseclasschecker.CaseClassChecker._

    case class B(x : Int, y : Int)
    class T(x : Int)

    check[B], it should pass at compile time
    check[T], will not compile!

```

