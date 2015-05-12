package com.olivierlafleur.topaze;

import org.antlr.v4.runtime.misc.NotNull;

public class TopazeVisitorVariable extends TopazeBaseVisitor<Variable> {
    private EtatMachine etatMachine;

    public TopazeVisitorVariable(EtatMachine etatMachine) {
        this.etatMachine = etatMachine;
    }

    @Override
    public Variable visitInitialisation(@NotNull TopazeParser.InitialisationContext ctx) {
        Variable variable = new Variable(ctx.nom.getText(), Integer.valueOf(ctx.valeur.getText()));

        etatMachine.ajouterVariable(variable);

        return variable;
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
        etatMachine.ecrire(ctx.texte.getText().substring(1, ctx.texte.getText().length()-1));

        return super.visitAffichage(ctx);
    }

    public EtatMachine getEtatMachine() {
        return etatMachine;
    }
}
