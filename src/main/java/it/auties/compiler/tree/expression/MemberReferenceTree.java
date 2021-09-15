package it.auties.compiler.tree.expression;

import com.sun.tools.javac.util.List;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import it.auties.compiler.tree.model.TypeArgumentsOwner;
import it.auties.compiler.tree.model.VarArgsOwner;
import it.auties.compiler.tree.source.BodyTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class MemberReferenceTree implements ExpressionTree, TypeArgumentsOwner, VarArgsOwner {
    private int position;
    
    @NonNull
    private Tree owner;

    @NonNull
    private Mode mode;

    @NonNull
    private ReferenceKind kind;

    @NonNull
    private String identifier;

    @NonNull
    private ExpressionTree referenced;

    @NonNull
    private List<@NonNull ExpressionTree> typeArguments;

    @NonNull
    private boolean polyExpression;

    @NonNull
    private boolean ownerAccessible;

    @NonNull
    private OverloadKind overloadKind;

    @NonNull
    private TypeTree varArgs;

    @Override
    public TreeTag tag() {
        return TreeTag.MEMBER_REFERENCE;
    }

    //TODO: Make dev friendly
    @AllArgsConstructor
    @Accessors(fluent = true)
    public enum ReferenceKind {
        SUPER(Mode.INVOKE, false),
        UNBOUND(Mode.INVOKE, true),
        STATIC(Mode.INVOKE, false),
        BOUND(Mode.INVOKE, false),
        IMPLICIT_INNER(Mode.NEW, false),
        TOP_LEVEL(Mode.NEW, false),
        ARRAY_CTOR(Mode.NEW, false);

        @Getter
        @NonNull
        private final Mode mode;

        @Getter
        private final boolean unbound;
    }

    public enum Mode {
        INVOKE,
        NEW
    }

    public enum OverloadKind {
        OVERLOADED,
        NOT_OVERLOADED,
        ERROR
    }
}
