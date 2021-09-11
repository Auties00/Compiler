package it.auties.compiler.tree;

public interface PolyExpressionTree extends ExpressionTree{
    @Override
    default boolean isPoly() {
        return true;
    }

    @Override
    default boolean isStandalone() {
        return false;
    }
}
