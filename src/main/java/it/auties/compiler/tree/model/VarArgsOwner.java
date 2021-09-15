package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.ClassInitializationTree;
import it.auties.compiler.tree.expression.MemberReferenceTree;
import it.auties.compiler.tree.expression.MethodInvocationTree;
import it.auties.compiler.tree.expression.TypeTree;

import java.util.Optional;

public sealed interface VarArgsOwner extends Tree permits ClassInitializationTree, MemberReferenceTree, MethodInvocationTree {
    Optional<TypeTree> varArgs();
}
