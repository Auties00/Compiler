package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(fluent = true)
public final enum BinaryAssignmentOperator implements BinaryOperator{
    PLUS(TreeTag.PLUS_ASSIGNMENT_OPERATOR),
    MINUS(TreeTag.MINUS_ASSIGNMENT_OPERATOR),
    MULTIPLICATION(TreeTag.MULTIPLICATION_ASSIGNMENT_OPERATOR),
    DIVISION(TreeTag.DIVISION_ASSIGNMENT_OPERATOR),
    MODULO(TreeTag.MODULO_ASSIGNMENT_OPERATOR),
    SHIFT_RIGHT(TreeTag.SHIFT_RIGHT_ASSIGNMENT_OPERATOR),
    SHIFT_LEFT(TreeTag.SHIFT_LEFT_ASSIGNMENT_OPERATOR),
    COMPLEMENTARY_BITWISE(TreeTag.COMPLEMENTARY_ASSIGNMENT_OPERATOR),
    OR_BITWISE(TreeTag.OR_BITWISE_ASSIGNMENT_OPERATOR),
    XOR_BITWISE(TreeTag.XOR_BITWISE_ASSIGNMENT_OPERATOR),
    AND_BITWISE(TreeTag.AND_BITWISE_ASSIGNMENT_OPERATOR),
    SHIFT_RIGHT_BITWISE(TreeTag.SHIFT_RIGHT_BITWISE_ASSIGNMENT_OPERATOR);

    @Getter
    private final TreeTag tag;
}
