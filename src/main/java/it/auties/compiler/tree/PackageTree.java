package it.auties.compiler.tree;

import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.Objects;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class PackageTree implements Tree, PackageOwner, Importable {
    private int position;
    
    @NonNull
    private String name;
    
    @NonNull
    private ExpressionTree declaration;
    
    @NonNull
    private List<@NonNull AnnotationTree> annotations;

    @NonNull
    private ClassTree info;

    @NonNull
    private ModuleTree enclosingModule;

    private PackageTree enclosingPackage;

    @Override
    public TreeType type() {
        return TreeType.PACKAGE;
    }

    @Override
    public PackageOwner owner() {
        return Objects.requireNonNullElse(enclosingPackage(), enclosingModule());
    }

    public boolean unnamed() {
        return name.isEmpty() && owner().type() != TreeType.PACKAGE;
    }
}
