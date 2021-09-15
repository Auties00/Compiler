package it.auties.compiler.tree.source;

import com.sun.tools.javac.code.Flags.Flag;
import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.*;
import it.auties.compiler.tree.statement.ClassTree;
import it.auties.compiler.tree.statement.VariableTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class MethodTree implements Tree, Importable, DefinableInClass, ModifiersOwner, ParametersOwner, TypeParametersOwner {
    private int position;

    @NonNull
    private ClassTree enclosingClass;

    @NonNull
    private String name;

    @NonNull
    private List<@NonNull Flag> modifiers;

    @NonNull
    private List<@NonNull AnnotationTree> annotations;

    @NonNull
    private List<@NonNull TypeParameterTree> typeParameters;

    @NonNull
    private ExpressionTree returnType;

    @NonNull
    private List<@NonNull VariableTree> parameters;

    @NonNull
    private List<@NonNull ExpressionTree> thrown;

    private BodyTree body;

    private ExpressionTree defaultExpression;

    private ExpressionTree receiverParam;

    @Override
    public TreeTag tag() {
        return TreeTag.METHOD;
    }

    @Override
    public ClassTree owner() {
        return enclosingClass;
    }

    public Optional<BodyTree> body(){
        return Optional.ofNullable(body);
    }

    public Optional<ExpressionTree> defaultExpression(){
        return Optional.ofNullable(defaultExpression);
    }

    public Optional<ExpressionTree> receiverParam(){
        return Optional.ofNullable(receiverParam);
    }
}
