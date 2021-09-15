package it.auties.compiler.tree.model;

import com.sun.tools.javac.code.Flags;
import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ClassInitializationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.MethodInvocationTree;
import it.auties.compiler.tree.module.ModuleTree;
import it.auties.compiler.tree.source.MethodTree;
import it.auties.compiler.tree.statement.VariableTree;

import java.util.List;

public sealed interface ModifiersOwner extends Tree permits ModuleTree, MethodTree, VariableTree {
    List<Flags.Flag> modifiers();
}
