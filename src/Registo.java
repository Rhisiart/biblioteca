import java.time.LocalDate;

public class Registo extends Object{

    private Utilizador utilizador;
    private LocalDate date;
    private String password;


    public Registo(Utilizador utilizador, LocalDate date, String password) {
        this.utilizador = utilizador;
        this.date = date;
        this.password = password;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
