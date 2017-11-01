# CaseClassChecker
Macro implementation to check if something is case class at compile time

To use this, simply do

```
    import com.net.samupra.macros.caseclasschecker.CaseClassChecker._

    case class B(x : Int, y : Int)
    class T(x : Int)

    check[B], it should pass at compile time
    check[T], will not compile!

```

