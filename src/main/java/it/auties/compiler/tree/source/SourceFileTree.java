package it.auties.compiler.tree.source;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.DefinableInSource;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.module.ModuleTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class SourceFileTree implements Tree {
    public int position;

    @NonNull
    private ModuleTree enclosingModule;

    @NonNull
    private PackageTree enclosingPackage;

    @NonNull
    private List<@NonNull DefinableInSource> definitions;

    @Override
    public TreeTag tag() {
        return TreeTag.SOURCE_FILE;
    }

    @Override
    public PackageTree owner() {
        return enclosingPackage;
    }
}
