package it.auties.compiler.tree.pattern;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.statement.VariableTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class BindingPatternTree implements PatternMatchingTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private VariableTree variable;

    @Override
    public TreeTag tag() {
        return TreeTag.BINDING_PATTERN;
    }
}
