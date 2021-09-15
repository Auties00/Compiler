package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.expression.IfTree;
import it.auties.compiler.tree.statement.AssertTree;
import it.auties.compiler.tree.statement.DoWhileTree;
import it.auties.compiler.tree.statement.ForTree;
import it.auties.compiler.tree.statement.WhileTree;

import java.util.List;

public sealed interface ConditionalTree extends MultipleConditionalTree, Tree permits IfTree, AssertTree, DoWhileTree, ForTree, WhileTree {
    ExpressionTree condition();

    @Override
    default List<ExpressionTree> conditions(){
        return List.of(condition());
    }
}
