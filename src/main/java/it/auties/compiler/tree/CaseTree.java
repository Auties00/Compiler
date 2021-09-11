package it.auties.compiler.tree;

import com.sun.tools.javac.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class CaseTree implements StatementTree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private List<ExpressionTree> conditions;

    @NonNull
    private BodyTree body; // Notice: only available in lambda switch case, for < Java 12 needs to be constructed from JCCase#getStatements

    private boolean lambda;

    @Override
    public TreeType type() {
        return TreeType.CASE;
    }
}
