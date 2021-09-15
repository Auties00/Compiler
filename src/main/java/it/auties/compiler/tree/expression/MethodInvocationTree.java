package it.auties.compiler.tree.expression;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.*;
import it.auties.compiler.tree.source.BodyTree;
import it.auties.compiler.tree.source.MethodTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class MethodInvocationTree implements PolyExpressionTree, ArgumentsOwner, TypeArgumentsOwner, VarArgsOwner {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private MethodTree invoked;

    @NonNull
    private List<@NonNull ExpressionTree> arguments;

    @NonNull
    private List<@NonNull ExpressionTree> typeArguments;

    @NonNull
    private TypeTree varArgs;

    @Override
    public TreeTag tag() {
        return TreeTag.METHOD_INVOCATION;
    }
}
