// Generated from C:/Users/Olivier/topaze/src/main/antlr4/com.olivierlafleur.topaze\Topaze.g4 by ANTLR 4.5
package com.olivierlafleur.topaze;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parseInstruction tree produced
 * by {@link TopazeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TopazeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parseInstruction tree produced by {@link TopazeParser#topaze}.
	 * @param ctx the parseInstruction tree
	 * @return the visitor result
	 */
	T visitTopaze(@NotNull TopazeParser.TopazeContext ctx);
}