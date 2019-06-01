import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioMem implements Repositorio {

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

    @Override
    public void adicionaUtilizador(Utilizador utilizador)
    {
        utiArray.add(utilizador);
    }

    @Override
    public void adicionaTipoUtilizador(TipoUtilizador tipo)
    {
        tipoUtilizadorArray.add(tipo);
    }

    @Override
    public void adicionaRequisicao(Requisicao requisicao)
    {
        requisicaoArray.add(requisicao);
    }

    @Override
    public void adicionaCopia(Copia copia)
    {
        copiaArray.add(copia);
    }

    @Override
    public void adicionaLivro(Livro livro)
    {
        livroArray.add(livro);
    }

    @Override
    public void adicionaPropostaRequisicao(PropostaAquisicao proposta)
    {
        propostaAquisicaosArray.add(proposta);
    }

    @Override
    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra)
    {
        requisicaoComprasArray.add(requisicaoCompra);
    }

    @Override
    public void adicionaEncomenda(Encomenda encomenda)
    {
        encomendaArray.add(encomenda);
    }

    @Override
    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro)
    {
        entradaNovoLivrosArray.add(entradaNovoLivro);
    }

    public void adicionaEmprestimo(Emprestimo emprestimo)
    {
        emprestimoArray.add(emprestimo);
    }

    @Override
    public void adicionaNotificacao(Notificacao notificacao)
    {
        notificacaoArray.add(notificacao);
    }

    @Override
    public void adicionaDevolucao(Devolucao devolucao)
    {
        devolucaoArray.add(devolucao);
    }

    @Override
    public void adicionaCoima(Coima coima)
    {
        coimaArray.add(coima);
    }

    @Override
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
