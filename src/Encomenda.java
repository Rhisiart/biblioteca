import java.time.LocalDate;

public class Encomenda extends Object {

    private LocalDate data;
    private RequisicaoCompra compras;

    public Encomenda(LocalDate data, RequisicaoCompra requisicao) {
        this.data = data;
        this.compras = requisicao;
    }

    public LocalDate getData() {
        return data;
    }

    public RequisicaoCompra getRequisicao() {
        return compras;
    }
}
