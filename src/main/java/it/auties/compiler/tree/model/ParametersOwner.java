package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.LambdaTree;
import it.auties.compiler.tree.source.MethodTree;
import it.auties.compiler.tree.statement.VariableTree;

import java.util.List;

public sealed interface ParametersOwner extends Tree permits LambdaTree, MethodTree {
    List<VariableTree> parameters();
}
