package it.auties.compiler.tree;

public sealed interface Importable extends Tree permits PackageTree, ClassTree, MethodTree {

}