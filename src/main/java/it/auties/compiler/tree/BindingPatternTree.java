package it.auties.compiler.tree;

import com.sun.tools.javac.tree.JCTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class BindingPatternTree implements PatternMatchingTree{
    private int position;

    @NonNull
    private Tree owner; //TODO: Specialize type

    @NonNull
    private VariableTree variable;

    @Override
    public TreeType type() {
        return TreeType.BINDING_PATTERN;
    }
}
