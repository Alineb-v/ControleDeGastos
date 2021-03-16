import org.junit.jupiter.api.Test;

import java.time.Month;

public class PagamentoRecorrenteTest {

    @Test
    void deveCriarLancamentosDeUmPagamentoRecorrenteQuinzenal() {
        PagamentoRecorrente pagamentoRecorrente =
                new PagamentoRecorrente("Energia",
                        Periodicidade.QUINZENAL,
                        100.0,
                        2,
                        true);
        System.out.println(pagamentoRecorrente.criarLancamentosDoMes(2021, Month.APRIL));
    }

}
