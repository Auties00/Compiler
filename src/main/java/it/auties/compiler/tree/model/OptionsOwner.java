package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ClassInitializationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.MethodInvocationTree;
import it.auties.compiler.tree.module.ExportsTree;
import it.auties.compiler.tree.module.OpensTree;
import it.auties.compiler.tree.module.RequiresTree;

import java.util.List;

public sealed interface OptionsOwner extends Tree permits ExportsTree, OpensTree, RequiresTree {
    List<Options> options();
}
