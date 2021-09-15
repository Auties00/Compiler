package it.auties.compiler.util;

import lombok.experimental.UtilityClass;

@UtilityClass
class PrimitiveTypeConstants {
    final int BYTE_CLASS = 1;
    final int CHAR_CLASS = 2;
    final int SHORT_CLASS = 4;
    final int INT_CLASS = 8;
    final int LONG_CLASS = 16;
    final int FLOAT_CLASS = 32;
    final int DOUBLE_CLASS = 64;

    final int BYTE_SUPERCLASSES = BYTE_CLASS | SHORT_CLASS | INT_CLASS |
            LONG_CLASS | FLOAT_CLASS | DOUBLE_CLASS;

    final int CHAR_SUPERCLASSES = CHAR_CLASS | INT_CLASS |
            LONG_CLASS | FLOAT_CLASS | DOUBLE_CLASS;

    final int SHORT_SUPERCLASSES = SHORT_CLASS | INT_CLASS |
            LONG_CLASS | FLOAT_CLASS | DOUBLE_CLASS;

    final int INT_SUPERCLASSES = INT_CLASS | LONG_CLASS | FLOAT_CLASS | DOUBLE_CLASS;

    final int LONG_SUPERCLASSES = LONG_CLASS | FLOAT_CLASS | DOUBLE_CLASS;

    final int FLOAT_SUPERCLASSES = FLOAT_CLASS | DOUBLE_CLASS;
}
