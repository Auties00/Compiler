package it.auties.compiler.tree.module;

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
public final class RequiresTree implements ModuleDirectiveTree, OptionsOwner {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private ExpressionTree requiredModule;

    @NonNull
    private List<@NonNull RequireOption> options;

    @Override
    public TreeTag tag() {
        return TreeTag.REQUIRES;
    }

    @AllArgsConstructor
    @Accessors(fluent = true)
    public final enum RequireOption implements Options {
        TRANSITIVE(0x0020),
        STATIC_PHASE(0x0040),
        SYNTHETIC(0x1000),
        MANDATED(0x8000),
        EXTRA(0x10000);

        @Getter
        private final int value;
    }
}
