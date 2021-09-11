package it.auties.compiler.tree;

import com.sun.tools.javac.code.Flags.Flag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class MethodTree implements Importable, DefinableInClass {
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
    public List<@NonNull VariableTree> parameters;

    @NonNull
    public List<@NonNull ExpressionTree> thrown;

    private BodyTree body;

    private ExpressionTree defaultExpression;

    private ExpressionTree receiverParam;

    @Override
    public TreeType type() {
        return TreeType.METHOD;
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
