package it.auties.compiler.tree;

public sealed interface DefinableInSource extends Tree permits ClassTree, ImportTree, EmptyStatement {

}