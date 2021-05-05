import java.time.LocalDate;

public class Lancamento {

    private final String descricao;
    private final LocalDate dataDeVencimento;
    private final double valor;
    private final boolean foiPago;
    private FormaDePagamento formaDePagamento;


    Lancamento(String descricao,
               LocalDate dataDeVencimento,
               double valor, boolean foiPago, FormaDePagamento formaDePagamento) {
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.valor = valor;
        this.foiPago = foiPago;
        this.formaDePagamento = formaDePagamento;

    }

    public String getStatus (){
        if (foiPago){
            return Status.PAGO.toString();
        }
        else {
            if (LocalDate.EPOCH.isBefore(dataDeVencimento)){
                return Status.PENDENTE.toString();
            }
            else {
                return Status.ATRASADO.toString();
            }
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }


    public double getValor() {
        return valor;
    }

    public FormaDePagamento getFormaDePagamento(){
        return formaDePagamento;

    }

    @Override
    public String toString() {
        return "Descricao: " + this.descricao + ", Data de Vencimento: " + this.dataDeVencimento +
                ", Valor: " + this.valor + ", Foi pago: " + this.foiPago + ", " +
                "Forma de Pagamento: " + this.formaDePagamento;
    }
}
