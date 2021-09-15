package it.auties.compiler.tree.model;

import it.auties.compiler.tree.module.ModuleTree;
import it.auties.compiler.tree.source.PackageTree;

public sealed interface PackageOwner extends Tree permits ModuleTree, PackageTree {

}