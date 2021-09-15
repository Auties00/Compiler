package it.auties.compiler.tree.expression;

import com.sun.tools.javac.code.TypeTag;
import it.auties.compiler.tree.model.Tree;
import it.auties.compiler.tree.model.TreeTag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

import java.util.Optional;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public final class LiteralTree implements TypeTree {
    private int position;

    @NonNull
    private Tree owner;

    @NonNull
    private TypeTag typeTag;

    private Object value;

    @Override
    public TreeTag tag() {
        return TreeTag.LITERAL;
    }

    public Optional<Object> value() {
        return Optional.ofNullable(switch (typeTag) {
            case BOOLEAN -> ((Integer) value) != 0;
            case CHAR -> {
                var intValue = (int) value;
                var charValue = (char) intValue;
                if (intValue != charValue) {
                    throw new AssertionError("bad value for char literal");
                }

                yield charValue;
            }

            default -> value;
        });
    }
}
