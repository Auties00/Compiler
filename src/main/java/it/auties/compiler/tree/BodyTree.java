package it.auties.compiler.tree;

import com.sun.tools.javac.code.Flags.Flag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.List;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class BodyTree implements Tree {
    private int position;

    @NonNull
    private Tree owner; //TODO: Specialize

    @NonNull
    private List<@NonNull Flag> flags;

    @NonNull
    private List<@NonNull ? extends StatementTree> statements;

    @Override
    public TreeType type() {
        return TreeType.BODY;
    }
}
