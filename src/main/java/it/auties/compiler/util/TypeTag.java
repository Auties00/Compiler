package it.auties.compiler.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import static it.auties.compiler.util.PrimitiveTypeConstants.*;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(fluent = true)
public enum TypeTag {
    BYTE(BYTE_CLASS, BYTE_SUPERCLASSES, true),
    CHAR(CHAR_CLASS, CHAR_SUPERCLASSES, true),
    SHORT(SHORT_CLASS, SHORT_SUPERCLASSES, true),
    LONG(LONG_CLASS, LONG_SUPERCLASSES, true),
    FLOAT(FLOAT_CLASS, FLOAT_SUPERCLASSES, true),
    INT(INT_CLASS, INT_SUPERCLASSES, true),
    DOUBLE(DOUBLE_CLASS, DOUBLE_CLASS, true),
    BOOLEAN(0, 0, true),
    VOID,
    CLASS,
    ARRAY,
    METHOD,
    PACKAGE,
    MODULE,
    TYPE_VARIABLE,
    INFERENCE_TYPE_VARIABLE,
    WILDCARD,
    ANY,
    DEFERRED,
    BOTTOM,
    NONE,
    ERROR,
    UNKNOWN,
    UNINITIALIZED_THIS,
    UNINITIALIZED_OBJECT;

    @Getter
    private int superClasses;

    @Getter
    private int numericClass;

    @Getter
    private boolean primitive;
}
