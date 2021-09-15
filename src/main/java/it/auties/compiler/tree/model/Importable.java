package it.auties.compiler.tree.model;

import it.auties.compiler.tree.source.MethodTree;
import it.auties.compiler.tree.source.PackageTree;
import it.auties.compiler.tree.statement.ClassTree;

public sealed interface Importable extends Tree permits PackageTree, ClassTree, MethodTree {

}