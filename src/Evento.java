import java.time.LocalDate;
import java.util.ArrayList;

public class Evento extends Object {

    private int lugares;
    private String local;
    private LocalDate date;
    private String descricao;
    private int numeroRegistos = 0;
    private ArrayList<Utilizador> arrayRegistoUtilizador = new ArrayList<>();


    public int getNumeroRegistos() {
        return numeroRegistos;
    }

    public Evento(int lugares, String local, LocalDate date, String descricao) {
        this.lugares = lugares;
        this.local = local;
        this.date = date;
        this.descricao = descricao;
    }

    public void registoEvento(Utilizador utilizador) throws Exception {

        if(numeroRegistos < lugares) {
            arrayRegistoUtilizador.add(utilizador);
            numeroRegistos++;
        }else {
            throw new Exception();
        }
    }

}
