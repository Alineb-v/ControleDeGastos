import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class PagamentoRecorrente {


    private final String descricao;
    private final Periodicidade periodicidade;
    private final double valor;
    private final int diaDoPrimeiroVencimento;
    private final boolean foiPago;


    PagamentoRecorrente(String descricao,
                        Periodicidade periodicidade,
                        double valor,
                        int diaDoPrimeiroVencimento, boolean foiPago) {

        this.descricao = descricao;
        this.periodicidade = periodicidade;
        this.valor = valor;
        this.diaDoPrimeiroVencimento = diaDoPrimeiroVencimento;
        this.foiPago = foiPago;
    }

    public List<Lancamento> criarLancamentosDoMes(int ano, Month mes) {
        LocalDate vencimento = LocalDate.of(ano, mes, diaDoPrimeiroVencimento);
        List<Lancamento> lancamentos = new ArrayList<>();
        int num = 0;
        while (vencimento.getMonth().equals(mes)) {
            lancamentos.add(new Lancamento(
                    this.descricao + " " + mes.getValue() + "/" + ano + " - " + ++num,
                    vencimento,
                    this.valor,
                    this.foiPago
            ));
            vencimento = vencimento.plusDays(this.periodicidade.getQtdDias());
        }
        return lancamentos;
    }


}
