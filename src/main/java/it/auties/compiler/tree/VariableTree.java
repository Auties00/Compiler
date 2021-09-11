package it.auties.compiler.tree;

import com.sun.tools.javac.code.Flags.Flag;
import com.sun.tools.javac.tree.JCTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class VariableTree implements DefinableInClass {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private String name;

    @NonNull
    private List<@NonNull Flag> modifiers;

    @NonNull
    private List<@NonNull AnnotationTree> annotations;

    private ExpressionTree variableType;

    private ExpressionTree value;

    @Override
    public TreeType type() {
        return TreeType.VARIABLE;
    }

    public Optional<ExpressionTree> variableType(){
        return Optional.ofNullable(variableType);
    }

    public Optional<ExpressionTree> value(){
        return Optional.ofNullable(value);
    }
}
