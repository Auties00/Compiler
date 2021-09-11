package it.auties.compiler.tree;

import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class SwitchTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    public ExpressionTree selected;

    @NonNull
    public List<@NonNull CaseTree> cases;

    @Override
    public TreeType type() {
        return TreeType.SWITCH;
    }
}
