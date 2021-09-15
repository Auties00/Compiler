package it.auties.compiler.tree.statement;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
// TODO: Implement a way to find target return walking up the hierarchy(OpenJDK doesn't implement this)
public final class ReturnTree implements StatementTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree value;

    @Override
    public TreeTag tag() {
        return TreeTag.RETURN;
    }
}
