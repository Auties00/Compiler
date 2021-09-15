package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.expression.ExpressionTree;

public non-sealed interface OperatorTree<O extends Operator> extends ExpressionTree {
    O operator();
}
