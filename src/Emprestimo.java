import java.time.LocalDate;

public class Emprestimo extends Object {

    private  LocalDate data;
    private  Requisicao requisicao;


    public Emprestimo(java.time.LocalDate data, Requisicao requisicao) {
        this.data = data;
        this.requisicao  = requisicao;

    }

    public  LocalDate getData() {
        return data;
    }

    public  Requisicao getRequisicao() {
        return requisicao;
    }
}
