package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.operator.OperatorTree;

public sealed interface ExpressionTree extends Tree permits AnnotationTree, ArrayIndexedCallTree, ArrayInitializationTree, AssignmentTree, CastTree, ErroneousTree, IfTree, InstanceOfTree, LetExpressionTree, LiteralTree, MemberReferenceTree, MemberSelectTree, ParameterizedTypeTree, ParenthesizedTree, PolyExpressionTree, PrimitiveTypeTree, UnionTypeTree, WildcardTree, TypeTree, OperatorTree {
    default boolean polyExpression() {
        return false;
    }

    default boolean standaloneExpression() {
        return true;
    }
}
