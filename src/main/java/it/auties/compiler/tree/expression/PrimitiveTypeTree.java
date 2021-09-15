package it.auties.compiler.tree.expression;

import com.sun.source.tree.*;
import com.sun.tools.javac.code.TypeTag;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.DefinedBy;
import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import javax.lang.model.type.TypeKind;

import static com.sun.tools.javac.tree.JCTree.Tag.*;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class PrimitiveTypeTree implements ExpressionTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private TypeTag typeTag;

    @Override
    public TreeTag tag() {
        return TreeTag.TYPE_PRIMITIVE;
    }
}
