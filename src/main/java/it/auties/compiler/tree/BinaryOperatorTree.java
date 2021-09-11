package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class BinaryOperatorTree implements PolyExpressionTree{
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
        return TreeType.BINARY_EXPRESSION;
    }
}