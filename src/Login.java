import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Login extends Object {

    private Utilizador utilizador;
    private String password;
    private ArrayList<Registo> arrayRegisto = new ArrayList<>();

    public Login(Utilizador utilizador, String password)  {
        this.utilizador = utilizador;
        this.password = password;
    }

    public void signIN() throws Exception {
        for(int i = 0 ; i < arrayRegisto.size(); i++) {
            if (arrayRegisto.get(i).getUtilizador().equals(utilizador)) {
                throw new Exception();
            }
        }
        LocalDate date = LocalDate.now();
        arrayRegisto.add(new Registo(utilizador,date,password));
    }

    public void forgetPw(String pw)
    {
        for(int i = 0 ; i < arrayRegisto.size(); i++) {
            if (arrayRegisto.get(i).getUtilizador().equals(utilizador))
            {
                LocalDate date = LocalDate.now();
                Registo r = arrayRegisto.get(i);
                r.setPassword(pw);
                r.setDate(date);
            }
        }
    }

    public ArrayList<Registo> getArrayRegisto() {
        return arrayRegisto;
    }

    public String getPassword() {
        return password;
    }
}
