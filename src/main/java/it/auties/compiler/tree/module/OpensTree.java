package it.auties.compiler.tree.module;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.Options;
import it.auties.compiler.tree.model.OptionsOwner;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class OpensTree implements ModuleDirectiveTree, OptionsOwner {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private ExpressionTree exportedPackage;

    @NonNull
    private List<@NonNull ExpressionTree> targetModules;

    @NonNull
    private List<@NonNull OpenOption> options;

    @Override
    public TreeTag tag() {
        return TreeTag.OPENS;
    }

    @AllArgsConstructor
    @Accessors(fluent = true)
    public final enum OpenOption implements Options {
        SYNTHETIC(0x1000),
        MANDATED(0x8000);

        @Getter
        private final int value;
    }
}
