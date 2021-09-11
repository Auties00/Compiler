package it.auties.compiler.tree;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class ArrayInitializationTree implements ExpressionTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private ExpressionTree arrayType;

    @NonNull
    private List<AnnotationTree> arrayTypeAnnotations;

    @NonNull
    private List<@NonNull ExpressionTree> dimensions;

    @NonNull
    private List<AnnotationTree> dimensionsAnnotations;

    @NonNull
    private List<JCTree.JCExpression> initializers;


    @Override
    public TreeType type() {
        return TreeType.ARRAY_INITIALIZATION;
    }
}
