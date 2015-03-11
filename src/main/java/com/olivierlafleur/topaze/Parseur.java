package com.olivierlafleur.topaze;

import com.olivierlafleur.topaze.instructions.Instruction;
import com.olivierlafleur.topaze.instructions.InstructionInitialisation;

public class Parseur {
    public Instruction parse(String s) {
        return new InstructionInitialisation();
    }
}
