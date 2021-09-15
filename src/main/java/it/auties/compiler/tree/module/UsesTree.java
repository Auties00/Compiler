package it.auties.compiler.tree.module;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class UsesTree implements ModuleDirectiveTree{
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree usedService;

    @Override
    public TreeTag tag() {
        return TreeTag.USES;
    }
}