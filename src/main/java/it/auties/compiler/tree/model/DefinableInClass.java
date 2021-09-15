package it.auties.compiler.tree.model;

import it.auties.compiler.tree.source.MethodTree;
import it.auties.compiler.tree.statement.ClassTree;
import it.auties.compiler.tree.statement.VariableTree;

public sealed interface DefinableInClass extends Tree permits ClassTree, MethodTree, VariableTree {

}