import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {

    private PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(String estado, LocalDate date, String oficio,PropostaAquisicao propostaAquisicao,Livro livro, Utilizador utilizador) {
        super(estado, date, oficio,livro,utilizador);
        this.propostaAquisicao = propostaAquisicao;
    }

    public PropostaAquisicao getPropostaAquisicao()
    {
        return propostaAquisicao;
    }
}




