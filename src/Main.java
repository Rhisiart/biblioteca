import java.nio.file.LinkOption;
import java.time.LocalDate;

public class Main {


    public static void main(String args[]) throws Exception {

        Utilizador u = new Utilizador("Manuel","Ativo",new TipoUtilizador("aluno",10));
        Utilizador u1 = new Utilizador("Manue","Ativo",new TipoUtilizador("aluno",10));
        Utilizador u2 = new Utilizador("Manue","Ativo",new TipoUtilizador("aluno",10));
        PropostaAquisicao propostaAquisicao = new PropostaAquisicao(LocalDate.now(),u,"Alice no Pais das Maravilhas");
        Livro l = new Livro("Programar em Java", "FCA");
        Copia c = new Copia(1, l);
        Requisicao requisicao = new Requisicao(LocalDate.now(),u,c);
        Emprestimo emprestimo = new Emprestimo(LocalDate.now(),requisicao);
        Devolucao devolucao = new Devolucao(LocalDate.now(),emprestimo);

        //RequisicaoCompraCopia requisicaoCompraCopia = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        //Encomenda encomenda = new Encomenda(LocalDate.now(),requisicaoCompraCopia);
        //EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);
        //... criação do objeto repositorio
        //Repositorio repo = new RepositorioMem();
        //repo.adicionaEntradaNovoLivro(entradaNovoLivro);
        //...login Utilizador
        //Login login = new Login(u,"aaa");
        //Login login1 = new Login(u1,"a");
        //Login a = new Login(u2,"sadasda");
        //a.signIN();
        //login.signIN();
        //login1.signIN();
        //login.forgetPw("a");
        //System.out.println(login.getPassword());
        //System.out.println(login.getArrayRegisto());

        //...Pagamento de coima
        Metodo_Pagamento dinheiro = new Metodo_Pagamento("dinheiro");
        Metodo_Pagamento paypal = new Metodo_Pagamento("paypal");
        Metodo_Pagamento mbway = new Metodo_Pagamento("mbway");
        Metodo_Pagamento multibanco = new Metodo_Pagamento("multibanco");
        Coima coima = new Coima("aaa",1211,devolucao,dinheiro);
        coima.pagamento();

        //...Inscricao em evento
        Evento evento1 = new Evento(3,"auditorio 2",LocalDate.now(),"palasta sobre outsystem");
        evento1.registoEvento(u);
        evento1.registoEvento(u1);
        //evento.registoEvento(u2);
    }

}
