
import org.testng.annotations.Test;
import java.time.LocalDate;

public class LancamentoTest {


    @Test
    void deveTestarLancamentoPago (){
        Lancamento lancamento =
                new Lancamento("agua",
                        LocalDate.now(),100.0, true,
                        FormaDePagamento.DINHEIRO);



    }

}
