package model;

import factory.FabricaJava;
import interfaces.Certificacao;
import interfaces.FabricaAbstrata;
import interfaces.FuncaoDesenvolvedor;

public class ProfissionalTI {
    private FuncaoDesenvolvedor funcao;
    private Certificacao certificacao;

    public ProfissionalTI(FabricaAbstrata fabricaTI) {
        this.certificacao = fabricaTI.createCertificacao();
        this.funcao = fabricaTI.createFuncaoDesenvolvedor();
    }

    public String emitirCertificadoOnline(){
        return this.certificacao.certificadoOnline();
    }

    public String informarLinguagem(){
        return this.funcao.informarLinguagem();
    }
}
