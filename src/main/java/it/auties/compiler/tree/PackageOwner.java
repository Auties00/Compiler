package it.auties.compiler.tree;

public sealed interface PackageOwner extends Tree permits ModuleTree, PackageTree {

}