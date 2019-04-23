import java.time.LocalDate;

public class RequisicaoCompraCopia extends RequisicaoCompra {


    public RequisicaoCompraCopia(String estado, LocalDate date, String oficio,Livro livro, Utilizador utilizador) {
        super(estado, date, oficio, livro, utilizador);
    }


}
