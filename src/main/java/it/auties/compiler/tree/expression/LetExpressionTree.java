package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.statement.StatementTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class LetExpressionTree implements ExpressionTree{
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private List<@NonNull StatementTree> statements;

    @NonNull
    private ExpressionTree expression;

    @Override
    public TreeTag tag() {
        return TreeTag.LET_EXPRESSION;
    }
}
