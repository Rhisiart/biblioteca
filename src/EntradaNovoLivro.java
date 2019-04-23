import java.time.LocalDate;

public class EntradaNovoLivro extends  Object{

    private LocalDate data;
    private Encomenda encomenda;
    private Copia copia;

    public EntradaNovoLivro(LocalDate date, Encomenda encomenda,Copia copia) {

        this.data = date;
        this.encomenda = encomenda;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public Copia getCopia() {
        return copia;
    }
}
