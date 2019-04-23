public class Utilizador extends java.lang.Object {

    private String nome;
    private String estado;
    private TipoUtilizador tipoUtilizador;

    public Utilizador(String nome, String estado, TipoUtilizador tipoUtilizador) {
        this.estado = estado;
        this.nome = nome;
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    public TipoUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }
}
