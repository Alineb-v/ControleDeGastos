import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LancamentoTest {

    @Test
    void deveTestarLancamentoPago (){
        Lancamento lancamento =
                new Lancamento("agua",
                        LocalDate.now(),56.0, true,
                        FormaDePagamento.DINHEIRO);



    }

}
