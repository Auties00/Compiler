package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class AssignmentTree implements ExpressionTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree variable;

    @NonNull
    private ExpressionTree value;

    @Override
    public TreeType type() {
        return TreeType.ASSIGNMENT;
    }
}
