### IBM XT config

layerblock
	FN1 1
	FN2 2
endblock

# default layer
remapblock
layer 0
	# toggle fn1 key
	LALT		FN1

	# toggle fn2 key
	CAPS_LOCK	FN2

	# ALT key
	BACKSLASH	LALT

	# backslash key
	BACK_QUOTE	BACKSLASH

	# win key
	SCROLL_LOCK	LGUI

	# insert key
	PAD_ASTERIX	INSERT
endblock

# fn1 layer
remapblock
layer 1
	# navigation keys at IJKL claster
	I			UP
	J			LEFT
	K			DOWN
	L			RIGHT
	U			HOME
	O			END
	Y			PAGE_UP
	H			PAGE_DOWN

	# navigation keys at WASD claster
	W			UP
	A			LEFT
	S			DOWN
	D			RIGHT
	Q			HOME
	E			END
	R			PAGE_UP
	F			PAGE_DOWN

	# F keys
	1			F1
	2			F2
	3			F3
	4			F4
	5			F5
	6			F6
	7			F7
	8			F8
	9			F9
	0			F10
	MINUS		F11
	EQUAL		F12

	# delete key
	BACKSPACE	DELETE

	# tilde key
	ESC			BACK_QUOTE

	# volume controls
	F7			MEDIA_VOLUME_UP
	F9			MEDIA_VOLUME_DOWN
	F10			MEDIA_MUTE
endblock

# fn2 layer
remapblock
layer 2
	# use unused keys for activating macros

	# ()/-> macro
	J			F13

	# []/{} macro
	K			F14
endblock

# macros
macroblock
	# toggle capslock by pressing both shifts
	macro LSHIFT RSHIFT
		press CAPS_LOCK
		break LSHIFT
		break RSHIFT
	endmacro

	macro RSHIFT LSHIFT
		press CAPS_LOCK
		break LSHIFT
		break RSHIFT
	endmacro

	# ()
	macro F13 -SHIFT
		make LSHIFT
		press 9
		press 0
		break LSHIFT
	endmacro

	# ->
	macro F13 SHIFT
		push_meta clear_meta SHIFT
		press MINUS
		make LSHIFT
		press PERIOD
		break LSHIFT
		pop_all_meta
	endmacro

	# []/{}
	macro F14
		press LEFT_BRACE
		press RIGHT_BRACE
	endmacro
endblock