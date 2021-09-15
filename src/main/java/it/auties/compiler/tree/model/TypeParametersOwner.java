package it.auties.compiler.tree.model;

import it.auties.compiler.tree.source.MethodTree;
import it.auties.compiler.tree.statement.ClassTree;
import it.auties.compiler.tree.statement.VariableTree;

import java.util.List;

public sealed interface TypeParametersOwner extends Tree permits MethodTree, ClassTree {
    List<VariableTree> typeParameters();
}
