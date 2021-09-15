package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.ConditionalTree;
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
public final class IfTree implements ExpressionTree, ConditionalTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree condition;

    @NonNull
    private BodyTree ifTrue;

    @NonNull
    private BodyTree ifFalse;

    private boolean ternary;

    @Override
    public TreeTag tag() {
        return ternary ? TreeTag.TERNARY : TreeTag.IF;
    }
}