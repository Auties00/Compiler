package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class IfTree implements ExpressionTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private ExpressionTree condition;

    @NonNull
    private BodyTree ifTrue;

    @NonNull
    private BodyTree ifFalse;

    @Override
    public TreeType type() {
        return TreeType.IF;
    }
}