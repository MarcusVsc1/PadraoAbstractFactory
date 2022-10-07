package model;

import interfaces.Certificacao;

public class CertificacaoJava  implements Certificacao {
    @Override
    public String certificadoOnline() {
        return "Este profissional possui ceritificação Java, emitida em 2022";
    }
}
