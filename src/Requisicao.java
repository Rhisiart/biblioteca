import java.time.LocalDate;

public class Requisicao extends java.lang.Object {

    private LocalDate date;
    private Utilizador utilizador;
    private Copia copia;

    public Requisicao(LocalDate data, Utilizador utilizador,Copia copia) {
        this.date = data;
        this.utilizador = utilizador;
        this.copia = copia;
    }

    public LocalDate getData() {
        return date;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public Copia getCopia() {
        return copia;
    }
}
