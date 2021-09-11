package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class ModuleTree implements Tree, PackageOwner{

    @Override
    public int position() {
        return 0;
    }

    @Override
    public TreeType type() {
        return null;
    }

    @Override
    public Tree owner() {
        return null;
    }
}
