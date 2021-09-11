package it.auties.compiler.tree;

public interface ExpressionTree extends Tree{
    default boolean isPoly() {
        return false;
    }

    default boolean isStandalone() {
        return true;
    }
}
