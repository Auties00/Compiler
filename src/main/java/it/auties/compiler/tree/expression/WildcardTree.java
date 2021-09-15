package it.auties.compiler.tree.expression;

import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class WildcardTree implements TypeTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private BoundKind boundKind;

    @NonNull
    private ExpressionTree bound;

    @Override
    public TreeTag tag() {
        return TreeTag.WILDCARD;
    }

    @AllArgsConstructor
    @Accessors(fluent = true)
    public enum BoundKind {
        EXTENDS("? extends "),
        SUPER("? super "),
        UNBOUND("?");

        @Getter
        private final String name;
    }
}
