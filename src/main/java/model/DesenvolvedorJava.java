package model;

import interfaces.FuncaoDesenvolvedor;

public class DesenvolvedorJava implements FuncaoDesenvolvedor {
    @Override
    public String informarLinguagem() {
        return "Este profissional é um DEV Java. Pode ter certeza que manja dos paranauê.";
    }
}
