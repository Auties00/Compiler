package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class WhileTree implements Tree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    public ExpressionTree condition;

    @NonNull
    private BodyTree body; //TODO: Check assumption about type

    @Override
    public TreeType type() {
        return TreeType.WHILE;
    }
}
