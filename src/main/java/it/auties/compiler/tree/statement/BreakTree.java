package it.auties.compiler.tree.statement;

import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
// TODO: Implement a way to find target break walking up the hierarchy
// TODO: Implement isValueBreak(< Java 12 switch statement)
public final class BreakTree implements StatementTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private String label;

    @Override
    public TreeTag tag() {
        return TreeTag.BREAK;
    }
}
