package it.auties.compiler.tree.source;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.expression.AnnotationTree;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.Importable;
import it.auties.compiler.tree.model.PackageOwner;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.module.ModuleTree;
import it.auties.compiler.tree.statement.ClassTree;
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
    public TreeTag tag() {
        return TreeTag.PACKAGE;
    }

    @Override
    public PackageOwner owner() {
        return Objects.requireNonNullElse(enclosingPackage(), enclosingModule());
    }

    public boolean unnamed() {
        return name.isEmpty() && owner().tag() != TreeTag.PACKAGE;
    }
}
