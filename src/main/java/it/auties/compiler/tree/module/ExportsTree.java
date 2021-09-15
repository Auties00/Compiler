package it.auties.compiler.tree.module;

import com.sun.source.tree.Tree;
import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.Options;
import it.auties.compiler.tree.model.OptionsOwner;
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
public final class ExportsTree implements ModuleDirectiveTree, OptionsOwner {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree exportedPackage;

    @NonNull
    private List<ExpressionTree> targetModules;

    @NonNull
    private List<ExportOption> options;

    @Override
    public TreeTag tag() {
        return TreeTag.EXPORTS;
    }

    @AllArgsConstructor
    @Accessors(fluent = true)
    public final enum ExportOption implements Options {
        SYNTHETIC(0x1000),
        MANDATED(0x8000);

        @Getter
        private final int value;
    }
}
