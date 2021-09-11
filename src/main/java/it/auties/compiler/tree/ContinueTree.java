package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
// TODO: Implement a way to find target continue walking up the hierarchy
public class ContinueTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private String label;

    @NonNull
    private ExpressionTree value;

    @Override
    public TreeType type() {
        return TreeType.CONTINUE;
    }
}
