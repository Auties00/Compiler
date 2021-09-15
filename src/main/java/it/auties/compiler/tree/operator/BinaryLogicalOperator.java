package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(fluent = true)
public final enum BinaryLogicalOperator implements BinaryOperator{
    AND(TreeTag.AND_OPERATOR),
    OR(TreeTag.OR_OPERATOR);

    @Getter
    private final TreeTag tag;
}
