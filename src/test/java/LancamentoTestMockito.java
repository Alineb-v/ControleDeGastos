import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class LancamentoTestMockito {

    @Test
    void testeCadastrarLancamento () {
        Lancamento lancamento1 =
                new Lancamento ("Agua",
                        LocalDate.now(),
                        100.00,
                        true,
                        FormaDePagamento.DINHEIRO);
        assertEquals(new Lancamento("Agua", LocalDate.now(),
                100.0,true,FormaDePagamento.DINHEIRO), lancamento1);
    }

}
