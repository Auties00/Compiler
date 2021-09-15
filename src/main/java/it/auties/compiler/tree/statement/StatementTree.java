package it.auties.compiler.tree.statement;

import it.auties.compiler.tree.model.Tree;

public sealed interface StatementTree extends Tree permits AssertTree, BreakTree, CaseTree, CatchTree, ClassTree, ContinueTree, DoWhileTree, EmptyStatement, ForEachTree, ForTree, LabelledTree, ReturnTree, SwitchTree, SynchronizedTree, ThrowTree, TryTree, VariableTree, WhileTree, YieldTree {

}
