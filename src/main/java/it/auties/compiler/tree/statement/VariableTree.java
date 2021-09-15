package it.auties.compiler.tree.statement;

import com.sun.tools.javac.code.Flags.Flag;
import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.DefinableInClass;
import it.auties.compiler.tree.model.ModifiersOwner;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class VariableTree implements StatementTree, DefinableInClass, ModifiersOwner {
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
    public TreeTag tag() {
        return TreeTag.VARIABLE;
    }

    public Optional<ExpressionTree> variableType(){
        return Optional.ofNullable(variableType);
    }

    public Optional<ExpressionTree> value(){
        return Optional.ofNullable(value);
    }
}
