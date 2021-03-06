# tangnano9k-spinal.g8

A [Giter8][g8] template of a simple Spinal project, for Tang Nano 9K board!

SpinalHDL + Tang Nano 9K!

- An demo project in template(yes, Blinky), ready to run and flash
- Build script for Linux, get all done under shell
  - Demonstrate the usage of `gw_sh`
- Generate a project(`.gprj`) for Gowin IDE (expiremental)

## Usage

**requires `sbt`**

```console
$ sbt new andelf/tangnano9k-spinal.g8
[info] welcome to sbt 1.5.7 (N/A Java 17.0.1)
[info] set current project to new (in build file:/tmp/sbt_b9087229/new/)

A template to create a simple SpinalHDL project

name [My Spinal Project]: Blinky
classname [Blinky]:
version [0.1.0-SNAPSHOT]:
package [example.hello]: com.example

Template applied in /home/user/FPGA_Projects/./blinky

$ cd blinky
$ sbt "runMain com.example.Main"  # generate verilog under rtl/
```

Then you can open Blinky.gprj with Gowin IDE!

Or under Linux(refer `/path/to/project/README.md`):

```console
$ make  # translate verilog, synth, PnR
$ make flash  # requires openFPGALoader
```

## Non-IDE yosys + nextpnr

```console
$ sbt new andelf/tangnano9k-spinal.g8 --branch yosys
```

## Template license
Written in 2022 by andelf

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
