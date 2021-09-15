package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(fluent = true)
public final enum BinaryBitwiseOperator implements BinaryOperator{
    AND(TreeTag.AND_BITWISE_OPERATOR),
    XOR(TreeTag.XOR_BITWISE_OPERATOR),
    OR(TreeTag.OR_BITWISE_OPERATOR),
    SHIFT_RIGHT(TreeTag.SHIFT_RIGHT_BITWISE_OPERATOR);

    @Getter
    private final TreeTag tag;
}
