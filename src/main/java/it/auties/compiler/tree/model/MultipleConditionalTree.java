package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.IfTree;
import it.auties.compiler.tree.expression.SwitchExpressionTree;
import it.auties.compiler.tree.statement.CaseTree;
import it.auties.compiler.tree.statement.SwitchTree;

import java.util.List;

public sealed interface MultipleConditionalTree extends Tree permits CaseTree, ConditionalTree {
    List<ExpressionTree> conditions();
}
