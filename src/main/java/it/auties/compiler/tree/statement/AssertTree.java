package it.auties.compiler.tree.statement;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.ConditionalTree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class AssertTree implements StatementTree, ConditionalTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree condition;

    @NonNull
    private ExpressionTree error;

    @Override
    public TreeTag tag() {
        return TreeTag.ASSERT;
    }
}
