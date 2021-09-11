package it.auties.compiler.tree;

import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class SourceFileTree implements Tree{
    public int position;

    @NonNull
    public ModuleTree enclosingModule;

    @NonNull
    public PackageTree enclosingPackage;

    @NonNull
    public List<@NonNull DefinableInSource> definitions;

    @Override
    public TreeType type() {
        return TreeType.SOURCE_FILE;
    }

    @Override
    public PackageTree owner() {
        return enclosingPackage;
    }
}
