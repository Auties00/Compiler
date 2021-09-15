package it.auties.compiler.tree.expression;

import com.sun.tools.javac.util.List;
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
public final class IntersectionTypeTree implements TypeTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private List<ExpressionTree> types;

    @Override
    public TreeTag tag() {
        return TreeTag.TYPE_INTERSECTION;
    }
}
