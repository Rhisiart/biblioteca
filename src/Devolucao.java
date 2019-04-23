import java.time.LocalDate;

public class Devolucao extends java.lang.Object {

    private  LocalDate data;
    private  Emprestimo emp;


    public Devolucao(java.time.LocalDate data, Emprestimo emprestimo) {
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
