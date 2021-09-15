package it.auties.compiler.tree.statement;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.model.MultipleConditionalTree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class CaseTree implements StatementTree, MultipleConditionalTree {
    private int position;

    @NonNull
    private BodyTree owner;

    @NonNull
    private List<ExpressionTree> conditions;

    @NonNull
    private BodyTree body; // Notice: only available in lambda switch case, for < Java 12 needs to be constructed from JCCase#getStatements

    private boolean lambda;

    @Override
    public TreeTag tag() {
        return TreeTag.CASE;
    }
}
