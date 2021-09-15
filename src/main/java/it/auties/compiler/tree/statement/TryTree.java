package it.auties.compiler.tree.statement;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class TryTree implements StatementTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private List<@NonNull VariableTree> resources;

    @NonNull
    private BodyTree body;

    @NonNull
    private List<@NonNull CatchTree> catchers;

    @NonNull
    private BodyTree finalizer;

    @Override
    public TreeTag tag() {
        return TreeTag.TRY;
    }
}
