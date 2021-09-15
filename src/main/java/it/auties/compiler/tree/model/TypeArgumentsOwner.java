package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.ClassInitializationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.MemberReferenceTree;
import it.auties.compiler.tree.expression.MethodInvocationTree;

import java.util.List;

public sealed interface TypeArgumentsOwner extends Tree permits ClassInitializationTree, MemberReferenceTree, MethodInvocationTree {
    List<ExpressionTree> typeArguments();
}
