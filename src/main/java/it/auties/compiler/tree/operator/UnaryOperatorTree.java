package it.auties.compiler.tree.operator;

import it.auties.compiler.tree.expression.ExpressionTree;
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
public class UnaryOperatorTree implements OperatorTree<UnaryOperator> {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private ExpressionTree argument;

    @NonNull
    private UnaryOperator operator;

    @Override
    public TreeTag tag() {
        return operator.tag();
    }
}