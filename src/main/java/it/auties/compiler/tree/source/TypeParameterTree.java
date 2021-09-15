package it.auties.compiler.tree.source;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class TypeParameterTree implements Tree{
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private String name;

    @NonNull
    private List<@NonNull ExpressionTree> bounds;

    @NonNull
    private List<@NonNull AnnotationTree> annotations;

    @Override
    public TreeTag tag() {
        return TreeTag.TYPE_PARAMETER;
    }
}
