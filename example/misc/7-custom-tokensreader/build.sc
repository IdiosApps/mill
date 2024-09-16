import mill.main.TokenReaders
import mill._
import mill.define._

object foo extends Module {
    def apply(path: os.Path) = T.command {
        println(path)
    }
}

// This example illustrates usage of custom `TokensReader`s.

/** Usage

> ./mill -i dev.run example/misc/7-custom-tokensreader foo.apply --path "/my/path/"
...
[info] compiling 1 Scala source to /Users/james/code/mill/example/misc/7-custom-tokensreader/out/mill-build/compile.dest/classes ...
[info] done compiling
/my/path

*/

