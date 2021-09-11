package it.auties.compiler.tree;

import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class ForTree implements Tree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    public List<@NonNull StatementTree> initializedVariables;

    @NonNull
    public ExpressionTree stepCondition;

    @NonNull
    public List<@NonNull ExpressionTree> stepOperations; //TODO: Java uses ExpressionTree, is it really needed?

    @NonNull
    private BodyTree body; //TODO: Check assumption about type

    @Override
    public TreeType type() {
        return TreeType.FOR;
    }
}
