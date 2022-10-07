import factory.FabricaJava;
import factory.FabricaPython;
import interfaces.FabricaAbstrata;
import model.ProfissionalTI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfissionaTITest {

    @Test
    public void certificadoJavaTest(){
        FabricaAbstrata fabricaAbstrata = new FabricaJava();
        ProfissionalTI profissionalTI = new ProfissionalTI(fabricaAbstrata);
        assertEquals("Este profissional possui ceritificação Java, emitida em 2022",profissionalTI.emitirCertificadoOnline());
    }

    @Test
    public void certificadoPythonTest(){
        FabricaAbstrata fabricaAbstrata = new FabricaPython();
        ProfissionalTI profissionalTI = new ProfissionalTI(fabricaAbstrata);
        assertEquals("Este profissional possui ceritificação Python, emitida em 2022",profissionalTI.emitirCertificadoOnline());
    }

    @Test
    public void desenvolvedorPythonTest(){
        FabricaAbstrata fabricaAbstrata = new FabricaPython();
        ProfissionalTI profissionalTI = new ProfissionalTI(fabricaAbstrata);
        assertEquals("Este profisional é um DEV Python. Tentei ler o código dele e me perdi.",profissionalTI.informarLinguagem());
    }

    @Test
    public void desenvolvedorJavaTest(){
        FabricaAbstrata fabricaAbstrata = new FabricaJava();
        ProfissionalTI profissionalTI = new ProfissionalTI(fabricaAbstrata);
        assertEquals("Este profissional é um DEV Java. Pode ter certeza que manja dos paranauê.",profissionalTI.informarLinguagem());
    }


}
