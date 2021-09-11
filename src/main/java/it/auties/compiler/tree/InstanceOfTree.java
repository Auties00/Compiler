package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class InstanceOfTree implements ExpressionTree{
    private int position;

    @NonNull
    private Tree owner; // TODO: Specialize type

    @NonNull
    private Tree checkType; // TODO: Specialize type

    @NonNull
    private ExpressionTree target;

    @Override
    public TreeType type() {
        return TreeType.INSTANCE_OF;
    }
}
