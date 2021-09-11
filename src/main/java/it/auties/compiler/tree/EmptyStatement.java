package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class EmptyStatement implements StatementTree, DefinableInSource {
    private int position;
    private Tree owner; // TODO: Specialize

    @Override
    public TreeType type() {
        return TreeType.EMPTY;
    }
}
