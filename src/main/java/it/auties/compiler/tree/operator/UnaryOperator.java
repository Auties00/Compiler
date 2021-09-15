package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Accessors(fluent = true)
public final enum UnaryOperator implements Operator {
    COMPLEMENTARY(TreeTag.COMPLEMENTARY_OPERATOR),
    NOT(TreeTag.NOT_OPERATOR),
    INTERNAL_NULL_CHECK(TreeTag.NULL_CHECK_OPERATOR),
    PRE_INCREMENT(TreeTag.PRE_INCREMENT_OPERATOR),
    POST_INCREMENT(TreeTag.POST_INCREMENT_OPERATOR),
    PRE_DECREMENT(TreeTag.PRE_DECREMENT_OPERATOR),
    POST_DECREMENT(TreeTag.POST_DECREMENT_OPERATOR);

    @Getter
    private final TreeTag tag;
}
