package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.ParametersOwner;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import it.auties.compiler.tree.statement.VariableTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class LambdaTree implements FunctionalExpressionTree, ParametersOwner {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private List<@NonNull VariableTree> parameters;

    @NonNull
    private BodyTree body;

    private boolean explicit;

    public LambdaTree(int position, BodyTree owner, List<VariableTree> parameters, BodyTree body) {
        this(position, owner, parameters, body, parameters.isEmpty() || parameters.get(0).variableType().isPresent());
    }

    @Override
    public TreeTag tag() {
        return TreeTag.LAMBDA;
    }
}