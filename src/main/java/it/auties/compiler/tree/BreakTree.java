package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
// TODO: Implement a way to find target break walking up the hierarchy
// TODO: Implement isValueBreak(< Java 12 switch statement)
public class BreakTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private String label;

    @Override
    public TreeType type() {
        return TreeType.BREAK;
    }
}
