
import org.testng.annotations.Test;

import java.time.Month;

public class PagamentoRecorrenteTest {

    @Test
    void deveCriarLancamentosDeUmPagamentoRecorrenteQuinzenal() {
        PagamentoRecorrente pagamentoRecorrente =
                new PagamentoRecorrente("Energia",
                        Periodicidade.QUINZENAL,
                        53.0,
                        2,
                        false,
                        FormaDePagamento.CARTAO_CREDITO);
        System.out.println(pagamentoRecorrente.criarLancamentosDoMes(2021, Month.APRIL));


    }

}
