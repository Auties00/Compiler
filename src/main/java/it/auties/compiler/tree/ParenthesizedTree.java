package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class ParenthesizedTree implements ExpressionTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree enclosed;

    @Override
    public TreeType type() {
        return TreeType.PARENTHESIZED_SUB_EXPRESSION;
    }
}