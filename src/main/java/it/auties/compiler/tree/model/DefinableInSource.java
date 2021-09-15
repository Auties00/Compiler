package it.auties.compiler.tree.model;

import it.auties.compiler.tree.source.ImportTree;
import it.auties.compiler.tree.statement.ClassTree;
import it.auties.compiler.tree.statement.EmptyStatement;

public sealed interface DefinableInSource extends Tree permits ClassTree, ImportTree, EmptyStatement {

}