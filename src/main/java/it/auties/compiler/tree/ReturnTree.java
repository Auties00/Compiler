package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
// TODO: Implement a way to find target return walking up the hierarchy(OpenJDK doesn't implement this)
public class ReturnTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private ExpressionTree value;

    @Override
    public TreeType type() {
        return TreeType.RETURN;
    }
}
