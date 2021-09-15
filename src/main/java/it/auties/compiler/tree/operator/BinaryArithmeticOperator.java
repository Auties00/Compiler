package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(fluent = true)
public final enum BinaryArithmeticOperator implements BinaryOperator{
    PLUS(TreeTag.PLUS_OPERATOR),
    MINUS(TreeTag.MINUS_OPERATOR),
    MULTIPLICATION(TreeTag.MULTIPLICATION_OPERATOR),
    DIVISION(TreeTag.DIVISION_OPERATOR),
    MODULO(TreeTag.MODULO_OPERATOR),
    SHIFT_RIGHT(TreeTag.SHIFT_RIGHT_OPERATOR),
    SHIFT_LEFT(TreeTag.SHIFT_LEFT_OPERATOR);

    @Getter
    private final TreeTag tag;
}
