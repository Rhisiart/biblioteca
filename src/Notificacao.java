import java.time.LocalDate;

public class Notificacao extends Object{

    private  LocalDate data;
    private  Emprestimo emp;

    public Notificacao(java.time.LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emp = emprestimo;
    }

    public  LocalDate getData() {
        return data;
    }

    public  Emprestimo getEmprestimo() {
        return emp;
    }
}
