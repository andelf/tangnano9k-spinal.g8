# Genreated by project template

VERILOG_FILE := rtl/$classname$.v
BITSTREAM_FILE := impl/pnr/$classname$.fs

all: \$(BITSTREAM_FILE)
.PHONY: all


\$(BITSTREAM_FILE): \$(VERILOG_FILE)
	gw_sh src/build/gowin.tcl

\$(VERILOG_FILE): src/main/scala/$package;format="packaged"$/$classname$.scala build.sbt src/board/tang-nano-9k.cst
	sbt "runMain $package$.Main"

.PHONY: clean
clean:
	rm -rf impl rtl

.PHONY: flash
flash: \$(BITSTREAM_FILE)
	openFPGALoader -b tangnano9k \$<
