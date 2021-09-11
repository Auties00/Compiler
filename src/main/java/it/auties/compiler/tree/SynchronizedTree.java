package it.auties.compiler.tree;

import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class SynchronizedTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private ExpressionTree lock;

    @NonNull
    private BodyTree body; //TODO: Check assumption about type

    @Override
    public TreeType type() {
        return TreeType.SYNCHRONIZED;
    }
}
