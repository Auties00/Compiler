package it.auties.compiler.tree;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
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
//TODO: Add support for varargs
public class ClassInitializationTree implements PolyExpressionTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private MethodTree constructor;

    @NonNull
    private ExpressionTree expression;

    @NonNull
    private List<ExpressionTree> arguments;

    @NonNull
    private List<ExpressionTree> typeArguments;

    private ExpressionTree enclosingExpression;

    private BodyTree anonymousClassBody;

    @Override
    public TreeType type() {
        return TreeType.CLASS_INITIALIZATION;
    }

    public Optional<ExpressionTree> enclosingExpression(){
        return Optional.ofNullable(enclosingExpression);
    }

    public Optional<BodyTree> anonymousClassBody(){
        return Optional.ofNullable(anonymousClassBody);
    }
}
