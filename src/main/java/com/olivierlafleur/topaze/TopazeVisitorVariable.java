package com.olivierlafleur.topaze;

import org.antlr.v4.runtime.misc.NotNull;

public class TopazeVisitorVariable extends TopazeBaseVisitor<Variable> {
    @Override
    public Variable visitInitialisation(@NotNull TopazeParser.InitialisationContext ctx) {
        return new Variable(ctx.nom.getText(), Integer.valueOf(ctx.valeur.getText()));
    }

    @Override
    public Variable visitParse(@NotNull TopazeParser.ParseContext ctx) {
        return super.visitParse(ctx);
    }

    @Override
    public Variable visitBlock(@NotNull TopazeParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Variable visitInstruction(@NotNull TopazeParser.InstructionContext ctx) {
        return super.visitInstruction(ctx);
    }

    @Override
    public Variable visitAffichage(@NotNull TopazeParser.AffichageContext ctx) {
        return super.visitAffichage(ctx);
    }
}
