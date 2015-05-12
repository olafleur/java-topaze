// Generated from C:/Users/prof/topaze/src/main/antlr4/com.olivierlafleur.topaze\Topaze.g4 by ANTLR 4.5
package com.olivierlafleur.topaze;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TopazeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TopazeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TopazeParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull TopazeParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TopazeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull TopazeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TopazeParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(@NotNull TopazeParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TopazeParser#affichage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffichage(@NotNull TopazeParser.AffichageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TopazeParser#initialisation_chaine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialisation_chaine(@NotNull TopazeParser.Initialisation_chaineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TopazeParser#initialisation_entier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialisation_entier(@NotNull TopazeParser.Initialisation_entierContext ctx);
}