package it.auties.compiler.tree;

import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class ArrayIndexedCallTree implements ExpressionTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private ExpressionTree array;

    @NonNull
    private ExpressionTree index;


    @Override
    public TreeType type() {
        return TreeType.ARRAY_INDEXED_CALL;
    }
}
