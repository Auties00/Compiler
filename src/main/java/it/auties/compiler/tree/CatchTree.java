package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class CatchTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private VariableTree target;

    @NonNull
    private BodyTree body; //TODO: Check assumption about type

    @Override
    public TreeType type() {
        return TreeType.CATCH;
    }
}