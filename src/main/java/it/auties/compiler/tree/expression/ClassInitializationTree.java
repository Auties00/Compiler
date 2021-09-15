package it.auties.compiler.tree.expression;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.*;
import it.auties.compiler.tree.source.BodyTree;
import it.auties.compiler.tree.source.MethodTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
//TODO: Add support for varargs
public final class ClassInitializationTree implements PolyExpressionTree, ArgumentsOwner, TypeArgumentsOwner, VarArgsOwner {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private MethodTree constructor;

    @NonNull
    private ExpressionTree expression;

    @NonNull
    private List<ExpressionTree> arguments;

    @NonNull
    private List<ExpressionTree> typeArguments;

    private TypeTree varArgs;

    private ExpressionTree enclosingExpression;

    private BodyTree anonymousClassBody;

    @Override
    public TreeTag tag() {
        return TreeTag.CLASS_INITIALIZATION;
    }

    public Optional<ExpressionTree> enclosingExpression(){
        return Optional.ofNullable(enclosingExpression);
    }

    public Optional<BodyTree> anonymousClassBody(){
        return Optional.ofNullable(anonymousClassBody);
    }

    public Optional<TypeTree> varArgs(){
        return Optional.ofNullable(varArgs);
    }
}
