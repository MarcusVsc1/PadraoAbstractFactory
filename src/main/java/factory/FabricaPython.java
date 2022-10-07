package factory;

import interfaces.Certificacao;
import interfaces.FabricaAbstrata;
import interfaces.FuncaoDesenvolvedor;
import model.CertificacaoPython;
import model.DesenvolvedorPython;

public class FabricaPython implements FabricaAbstrata {
    @Override
    public Certificacao createCertificacao() {
        return new CertificacaoPython();
    }

    @Override
    public FuncaoDesenvolvedor createFuncaoDesenvolvedor() {
        return new DesenvolvedorPython();
    }
}
