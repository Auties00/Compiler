package it.auties.compiler.tree;

public interface Tree {
    int position();
    TreeType type();
    Tree owner();
    default String prettyPrint(){
        throw new UnsupportedOperationException("Not implemented");
    }
}
