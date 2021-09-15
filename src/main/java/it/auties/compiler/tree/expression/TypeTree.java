package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.expression.ExpressionTree;

public sealed interface TypeTree extends ExpressionTree permits ArrayTypeTree, IdentifierTree, IntersectionTypeTree, LiteralTree, UnionTypeTree, WildcardTree {
}
