package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class AssertTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private ExpressionTree condition;

    @NonNull
    private ExpressionTree error;

    @Override
    public TreeType type() {
        return TreeType.ASSERT;
    }
}
