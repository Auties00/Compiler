package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.model.TreeTag;

public sealed interface Operator permits BinaryOperator, UnaryOperator {
    TreeTag tag();
}
