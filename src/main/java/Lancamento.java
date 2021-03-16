import java.time.LocalDate;

public class Lancamento {

    private final String descricao;
    private final LocalDate dataDeVencimento;
    private final double valor;
    private final boolean foiPago;

    Lancamento(String descricao,
               LocalDate dataDeVencimento,
               double valor, boolean foiPago) {
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.valor = valor;
        this.foiPago = foiPago;

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

    @Override
    public String toString() {
        return "Lancamento{" +
                "descricao='" + descricao + '\'' +
                ", dataDeVencimento=" + dataDeVencimento +
                ", valor=" + valor +
                '}';
    }
}
