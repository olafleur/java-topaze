// Generated from C:/Users/Olivier/topaze/src/main/antlr4/com.olivierlafleur.topaze\Topaze.g4 by ANTLR 4.5
package com.olivierlafleur.topaze;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parseInstruction tree produced by
 * {@link TopazeParser}.
 */
public interface TopazeListener extends ParseTreeListener {
	/**
	 * Enter a parseInstruction tree produced by {@link TopazeParser#topaze}.
	 * @param ctx the parseInstruction tree
	 */
	void enterTopaze(@NotNull TopazeParser.TopazeContext ctx);
	/**
	 * Exit a parseInstruction tree produced by {@link TopazeParser#topaze}.
	 * @param ctx the parseInstruction tree
	 */
	void exitTopaze(@NotNull TopazeParser.TopazeContext ctx);
}