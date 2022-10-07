package factory;

import interfaces.Certificacao;
import interfaces.FabricaAbstrata;
import interfaces.FuncaoDesenvolvedor;
import model.CertificacaoJava;
import model.DesenvolvedorJava;

public class FabricaJava implements FabricaAbstrata {

    @Override
    public Certificacao createCertificacao() {
        return new CertificacaoJava();
    }

    @Override
    public FuncaoDesenvolvedor createFuncaoDesenvolvedor() {
        return new DesenvolvedorJava();
    }
}
