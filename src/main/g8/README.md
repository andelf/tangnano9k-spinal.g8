## $name$

### Usage

**NOTE**: Before you start, you should have `sbt` installed.

```shell
cd $name;format="norm"$

sbt "runMain $package$.Main"

# then the project with Gowin IDE
```

### For Linux

Install [openFPGALoader](https://github.com/trabucayre/openFPGALoader).
Add `Gowin/IDE/bin` to your `PATH`.

```
openFPGALoader --detect

make  # compile .fs bitstream

make flash  # usage openFPGALoader to program
```
