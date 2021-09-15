package it.auties.compiler.tree.module;

import com.sun.tools.javac.code.Flags.Flag;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.ModifiersOwner;
import it.auties.compiler.tree.model.PackageOwner;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.SourceFileTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class ModuleTree implements Tree, PackageOwner, ModifiersOwner {
    private int position;

    @NonNull
    private SourceFileTree owner;

    @NonNull
    private ExpressionTree name;

    @NonNull
    private List<@NonNull Flag> modifiers;

    @NonNull
    private List<@NonNull ModuleDirectiveTree> members;

    private boolean open;

    @Override
    public TreeTag tag() {
        return TreeTag.MODULE;
    }
}
