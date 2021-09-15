package it.auties.compiler.tree.expression;

public non-sealed interface PolyExpressionTree extends ExpressionTree {
    @Override
    default boolean polyExpression() {
        return true;
    }

    @Override
    default boolean standaloneExpression() {
        return false;
    }
}
