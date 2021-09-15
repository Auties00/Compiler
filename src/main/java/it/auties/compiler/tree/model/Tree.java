package it.auties.compiler.tree.model;

import it.auties.compiler.tree.expression.ExpressionTree;
import it.auties.compiler.tree.module.ModuleDirectiveTree;
import it.auties.compiler.tree.module.ModuleTree;
import it.auties.compiler.tree.pattern.PatternMatchingTree;
import it.auties.compiler.tree.source.*;
import it.auties.compiler.tree.statement.StatementTree;

public sealed interface Tree permits ExpressionTree, ArgumentsOwner, ConditionalTree, DefinableInClass, DefinableInSource, Importable, ModifiersOwner, MultipleConditionalTree, OptionsOwner, PackageOwner, ParametersOwner, TypeArgumentsOwner, TypeParametersOwner, VarArgsOwner, ModuleDirectiveTree, ModuleTree, PatternMatchingTree, BodyTree, ImportTree, MethodTree, PackageTree, SourceFileTree, TypeParameterTree, StatementTree {
    int position();
    TreeTag tag();
    Tree owner();
    default String prettyPrint(){
        throw new UnsupportedOperationException("Not implemented");
    }
}
