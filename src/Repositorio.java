import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Repositorio extends Object {

    private  ArrayList<Utilizador> utiArray = new ArrayList<>();
    private  ArrayList<TipoUtilizador> tipoUtilizadorArray = new ArrayList<>();
    private  ArrayList<Requisicao> requisicaoArray = new ArrayList<>();
    private  ArrayList<Copia> copiaArray = new ArrayList<>();
    private  ArrayList<Livro> livroArray = new ArrayList<>();
    private  ArrayList<Emprestimo> emprestimoArray = new ArrayList<>();
    private  ArrayList<Notificacao> notificacaoArray = new ArrayList<>();
    private  ArrayList<Devolucao> devolucaoArray = new ArrayList<>();
    private  ArrayList<Coima> coimaArray = new ArrayList<>();
    private  ArrayList<PropostaAquisicao> propostaAquisicaosArray = new ArrayList<>();
    private  ArrayList<RequisicaoCompra> requisicaoComprasArray = new ArrayList<>();
    private  ArrayList<Encomenda> encomendaArray = new ArrayList<>();
    private  ArrayList<EntradaNovoLivro> entradaNovoLivrosArray = new ArrayList<>();
    private  Emprestimo emp;
    private  LocalDate data;



    public Repositorio() {
    }

    public void adicionaUtilizador(Utilizador utilizador)
    {
        utiArray.add(utilizador);
    }

    public void adicionaTipoUtilizador(TipoUtilizador tipo)
    {
        tipoUtilizadorArray.add(tipo);
    }

    public void adicionaRequisicao(Requisicao requisicao)
    {
        requisicaoArray.add(requisicao);
    }

    public void adicionaCopia(Copia copia)
    {
        copiaArray.add(copia);
    }

    public void adicionaLivro(Livro livro)
    {
        livroArray.add(livro);
    }

    public void adicionaPropostaRequisicao(PropostaAquisicao proposta)
    {
        propostaAquisicaosArray.add(proposta);
    }

    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra)
    {
        requisicaoComprasArray.add(requisicaoCompra);
    }

    public void adicionaEncomenda(Encomenda encomenda)
    {
        encomendaArray.add(encomenda);
    }

    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro)
    {
        entradaNovoLivrosArray.add(entradaNovoLivro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo)
    {
        emprestimoArray.add(emprestimo);
    }

    public void adicionaNotificacao(Notificacao notificacao)
    {
        notificacaoArray.add(notificacao);
    }

    public void adicionaDevolucao(Devolucao devolucao)
    {
        devolucaoArray.add(devolucao);
    }

    public void adicionaCoima(Coima coima)
    {
        coimaArray.add(coima);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r)
    {
       for(int i = 0; i < emprestimoArray.size(); i++)
       {
            if(emprestimoArray.get(i).getRequisicao().equals(r))
            {
                return emprestimoArray.get(i);
            }
       }
        return null;
    }
}
