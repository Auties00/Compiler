package it.auties.compiler.tree.operator;

public sealed interface BinaryOperator extends Operator permits BinaryArithmeticOperator, BinaryAssignmentOperator, BinaryBitwiseOperator, BinaryLogicalOperator, BinaryRelationalOperator {

}