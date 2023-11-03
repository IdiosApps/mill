import mill._


def foo(path: os.Path) = T.command {
  println(path)
}

// This example illustrates usage of custom `TokensReader`s.

/** Usage

> ./mill -i dev.run example/misc/7-custom-tokensreader foo.run
...
[info] compiling 1 Scala source to /Users/james/code/mill/example/misc/7-custom-tokensreader/out/mill-build/compile.dest/classes ...
[error] /Users/james/code/mill/example/misc/7-custom-tokensreader/out/mill-build/generateScriptSources.dest/millbuild/build.sc:26:5: could not find implicit value for parameter tokensReader: mainargs.TokensReader[os.Path]
[error] def foo(path: os.Path) = T.command {
[error]     ^
[error] one error found
1 targets failed
compile Compilation failed


*/

