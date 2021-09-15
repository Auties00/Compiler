package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class InstanceOfTree implements ExpressionTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private TypeTree checkType;

    @NonNull
    private ExpressionTree target;

    @Override
    public TreeTag tag() {
        return TreeTag.INSTANCE_OF;
    }
}
