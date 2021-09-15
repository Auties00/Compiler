package it.auties.compiler.tree.expression;

import com.sun.source.tree.Tree;
import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import it.auties.compiler.tree.statement.CaseTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class SwitchExpressionTree implements PolyExpressionTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private ExpressionTree selected;

    @NonNull
    private List<@NonNull CaseTree> cases;

    @Override
    public TreeTag tag() {
        return TreeTag.SWITCH_EXPRESSION;
    }
}
