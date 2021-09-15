package it.auties.compiler.tree.source;

import com.sun.tools.javac.code.Flags.Flag;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.statement.StatementTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class BodyTree implements Tree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private List<@NonNull Flag> flags;

    @NonNull
    private List<@NonNull ? extends StatementTree> statements;

    @Override
    public TreeTag tag() {
        return TreeTag.BODY;
    }
}
