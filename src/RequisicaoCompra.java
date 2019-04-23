import java.time.LocalDate;

public class RequisicaoCompra extends Object {

    private LocalDate data;
    private String oficio;
    private String estado;
    private Livro livro;
    private Utilizador utilizador;

    public RequisicaoCompra(String estado, LocalDate data,String oficio,Livro livro, Utilizador utilizador) {

        this.data = data;
        this.estado = estado;
        this.oficio = oficio;
        this.livro = livro;
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public String getOficio() {
        return oficio;
    }

    public String getEstado() {
        return estado;
    }

    public Livro getLivro() {
        return livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
}
