package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ClassInitializationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.MethodInvocationTree;

import java.util.List;

public sealed interface ArgumentsOwner extends Tree permits AnnotationTree, ClassInitializationTree, MethodInvocationTree {
    List<ExpressionTree> arguments();
}
