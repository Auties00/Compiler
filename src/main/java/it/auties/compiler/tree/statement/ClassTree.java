package it.auties.compiler.tree.statement;

import com.sun.tools.javac.code.Flags.Flag;
import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.*;
import it.auties.compiler.tree.source.SourceFileTree;
import it.auties.compiler.tree.source.TypeParameterTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class ClassTree implements StatementTree, DefinableInSource, Importable, DefinableInClass, TypeParametersOwner{
    private int position;

    private ClassTree enclosingClass;

    @NonNull
    private SourceFileTree enclosingSource;

    @NonNull
    private String name;

    @NonNull
    private List<@NonNull Flag> modifiers;

    @NonNull
    private List<@NonNull AnnotationTree> annotations;

    @NonNull
    private List<@NonNull TypeParameterTree> typeParameters;

    @NonNull
    private ExpressionTree superClass;

    @NonNull
    private List<@NonNull ExpressionTree> implemented;

    @NonNull
    private List<@NonNull ExpressionTree> permitted;

    @NonNull
    private List<@NonNull DefinableInClass> members; // TODO: Add records

    @Override
    public TreeTag tag() {
        if(modifiers.contains(Flag.ANNOTATION)){
            return TreeTag.ANNOTATED_TYPE;
        }
        
        if(modifiers.contains(Flag.INTERFACE)){
            return TreeTag.INTERFACE;
        }

        if(modifiers.contains(Flag.ENUM)){
            return TreeTag.ENUM;
        }
        
        if(modifiers.contains(Flag.RECORD)){
            return TreeTag.RECORD;
        }
        
        return TreeTag.CLASS;
    }

    @Override
    public Tree owner() {
        return Objects.requireNonNullElse(enclosingClass, enclosingSource);
    }

    public Optional<ClassTree> enclosingClass(){
        return Optional.ofNullable(enclosingClass);
    }
}
