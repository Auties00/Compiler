package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(fluent = true)
public final enum BinaryRelationalOperator implements BinaryOperator{
    GREATER(TreeTag.GREATER_OPERATOR),
    GREATER_OR_EQUAL(TreeTag.GREATER_OR_EQUAL_OPERATOR),
    LESS(TreeTag.LESS_OPERATOR),
    LESS_OR_EQUAL(TreeTag.LESS_OR_EQUAL_OPERATOR),
    EQUAL(TreeTag.EQUAL_OPERATOR),
    NOT_EQUAL(TreeTag.NOT_EQUAL_OPERATOR);

    @Getter
    private final TreeTag tag;
}
