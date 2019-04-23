import java.time.LocalDate;

public class PropostaAquisicao extends Object {

    private LocalDate data;
    private Utilizador utilizador;
    private String infoLivro;

    public PropostaAquisicao(LocalDate date, Utilizador utilizador, String infoLivro) {
        this.data = date;
        this.utilizador = utilizador;
        this.infoLivro = infoLivro;
    }

    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public String getInfoLivro() {
        return infoLivro;
    }
}
