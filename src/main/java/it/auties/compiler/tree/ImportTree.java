package it.auties.compiler.tree;

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
    public TreeType type() {
        return TreeType.IMPORT;
    }

    @Override
    public Tree owner() {
        return enclosingSourceFile;
    }
}
