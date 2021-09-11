package it.auties.compiler.tree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@Accessors(fluent = true)
public class LabelledTree implements Tree{
    private int position;

    @NonNull
    private BodyTree owner; // TODO: Check that static blocks are methods

    @NonNull
    private String name;

    @NonNull
    private BodyTree body; //TODO: Check assumption about type

    @Override
    public TreeType type() {
        return TreeType.LABEL;
    }
}
