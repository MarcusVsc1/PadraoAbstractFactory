package model;

import interfaces.Certificacao;

public class CertificacaoPython implements Certificacao {
    @Override
    public String certificadoOnline() {
        return "Este profissional possui ceritificação Python, emitida em 2022";
    }
}
