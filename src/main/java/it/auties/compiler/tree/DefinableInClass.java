package it.auties.compiler.tree;

public sealed interface DefinableInClass extends Tree permits ClassTree, MethodTree, VariableTree {

}