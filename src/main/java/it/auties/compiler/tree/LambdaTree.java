package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class LambdaTree implements FunctionalExpressionTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private List<@NonNull VariableTree> parameters;

    @NonNull
    private BodyTree body;

    private boolean explicit;

    public LambdaTree(int position, BodyTree owner, List<VariableTree> parameters, BodyTree body) {
        this(position, owner, parameters, body, parameters.isEmpty() || parameters.get(0).variableType().isPresent());
    }

    @Override
    public TreeType type() {
        return TreeType.LAMBDA;
    }
}