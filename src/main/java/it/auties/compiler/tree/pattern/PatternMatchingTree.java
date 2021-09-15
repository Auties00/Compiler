package it.auties.compiler.tree.pattern;

import it.auties.compiler.tree.model.Tree;

public sealed interface PatternMatchingTree extends Tree permits BindingPatternTree {

}
