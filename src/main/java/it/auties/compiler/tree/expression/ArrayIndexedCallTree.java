package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class ArrayIndexedCallTree implements ExpressionTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private ExpressionTree array;

    @NonNull
    private ExpressionTree index;

    @Override
    public TreeTag tag() {
        return TreeTag.ARRAY_INDEXED_CALL;
    }
}
