public class TipoUtilizador extends java.lang.Object {

    private String descricao;
    private int prazoEmprestimo;

    public TipoUtilizador(String descricao, int prazoEmprestimo) {
        this.descricao = descricao;
        this.prazoEmprestimo = prazoEmprestimo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }
}
