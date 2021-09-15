package it.auties.compiler.tree.statement;

import it.auties.compiler.tree.model.DefinableInSource;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class EmptyStatement implements StatementTree, DefinableInSource {
    private int position;
    private Tree owner;

    @Override
    public TreeTag tag() {
        return TreeTag.EMPTY;
    }
}
