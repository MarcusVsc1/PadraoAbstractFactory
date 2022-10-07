package model;

import interfaces.FuncaoDesenvolvedor;

public class DesenvolvedorPython implements FuncaoDesenvolvedor {
    @Override
    public String informarLinguagem() {
        return "Este profisional é um DEV Python. Tentei ler o código dele e me perdi.";
    }
}
