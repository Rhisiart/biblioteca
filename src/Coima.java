import java.time.LocalDate;

public class Coima extends java.lang.Object {

    private  String descricao ;
    private  float valor;
    private  Devolucao devolucao;
    private Metodo_Pagamento metodo_pagamento;


    public Coima(String descricao, float valor, Devolucao devolucao,Metodo_Pagamento metodo_pagamento) {
        this.descricao = descricao;
        this.valor = valor;
        this.devolucao = devolucao;
        this.metodo_pagamento = metodo_pagamento;
    }

    public void pagamento()
    {
        String nome = metodo_pagamento.getOpcao_pagamento();
        System.out.println("O valor pago foi " + valor);
        System.out.println(" esta pago pelo metodo " + nome);
    }

    public  String getDescricao() {
        return descricao;
    }

    public  float getValor() {
        return valor;
    }

    public  Devolucao getDevolucao() {
        return devolucao;
    }
}

