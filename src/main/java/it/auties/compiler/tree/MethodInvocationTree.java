package it.auties.compiler.tree;

import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
//TODO: Add support for varargs
public class MethodInvocationTree implements PolyExpressionTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private MethodTree invoked;

    @NonNull
    private List<ExpressionTree> arguments;

    @NonNull
    private List<ExpressionTree> typeArguments;


    @Override
    public TreeType type() {
        return TreeType.METHOD_INVOCATION;
    }
}
