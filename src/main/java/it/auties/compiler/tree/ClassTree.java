package it.auties.compiler.tree;

import com.sun.tools.javac.code.Flags.Flag;
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
public final class ClassTree implements DefinableInSource, Importable, DefinableInClass {
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
    public TreeType type() {
        if(modifiers.contains(Flag.ANNOTATION)){
            return TreeType.ANNOTATED_TYPE;
        }
        
        if(modifiers.contains(Flag.INTERFACE)){
            return TreeType.INTERFACE;
        }

        if(modifiers.contains(Flag.ENUM)){
            return TreeType.ENUM;
        }
        
        if(modifiers.contains(Flag.RECORD)){
            return TreeType.RECORD;
        }
        
        return TreeType.CLASS;
    }

    @Override
    public Tree owner() {
        return Objects.requireNonNullElse(enclosingClass, enclosingSource);
    }

    public Optional<ClassTree> enclosingClass(){
        return Optional.ofNullable(enclosingClass);
    }
}
