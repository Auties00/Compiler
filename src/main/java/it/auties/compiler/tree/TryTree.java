package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class TryTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private List<Tree> resources; // TODO: Specialize type

    @NonNull
    private BodyTree body; //TODO: Check assumption about type

    @NonNull
    private List<@NonNull CatchTree> catchers;

    @NonNull
    private BodyTree finalizer;

    @Override
    public TreeType type() {
        return TreeType.TRY;
    }
}
