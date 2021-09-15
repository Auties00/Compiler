package it.auties.compiler.tree.expression;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.ArgumentsOwner;
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
public final class AnnotationTree implements ExpressionTree, ArgumentsOwner {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private Tree type;

    @NonNull
    private List<ExpressionTree> arguments;

    private boolean typeAnnotation;

    @Override
    public TreeTag tag() {
        return typeAnnotation ? TreeTag.TYPE_ANNOTATION : TreeTag.ANNOTATION;
    }
}
