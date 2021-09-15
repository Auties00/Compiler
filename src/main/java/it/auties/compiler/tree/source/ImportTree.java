package it.auties.compiler.tree.source;

import it.auties.compiler.tree.model.DefinableInSource;
import it.auties.compiler.tree.model.Importable;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class ImportTree implements Tree, DefinableInSource {
    private int position;

    @NonNull
    private SourceFileTree enclosingSourceFile;

    @NonNull
    private Importable target;

    private boolean staticQualifier;

    @Override
    public TreeTag tag() {
        return TreeTag.IMPORT;
    }

    @Override
    public Tree owner() {
        return enclosingSourceFile;
    }
}
