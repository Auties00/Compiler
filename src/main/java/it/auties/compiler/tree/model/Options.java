package it.auties.compiler.tree.model;

import it.auties.compiler.tree.module.ExportsTree;
import it.auties.compiler.tree.module.OpensTree;
import it.auties.compiler.tree.module.RequiresTree;

public sealed interface Options permits ExportsTree.ExportOption, OpensTree.OpenOption, RequiresTree.RequireOption {
}
