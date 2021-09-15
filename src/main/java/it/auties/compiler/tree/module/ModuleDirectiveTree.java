package it.auties.compiler.tree.module;

import it.auties.compiler.tree.model.Tree;

public sealed interface ModuleDirectiveTree extends Tree permits ExportsTree, OpensTree, ProvidesTree, RequiresTree, UsesTree {
}
