package br.pucpcaldas.bolsa.dominio;

import org.joda.time.LocalDate;

/**
 * Armazena uma negociação com preco, quantidade e data.
 */
public class Negocio {
    private final double preco;
    private final int quantidade;
    private final LocalDate data;

    /**
     * Construtor da classe.
     * 
     * @param preco      preço de negociação
     * @param quantidade quantidade negociada
     * @param data       data da neogiciação
     */
    public Negocio(double preco, int quantidade, LocalDate data) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    /**
     * Retorna da data da negociação.
     * @return data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Retorna a quantidade negociada.
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Retorna o preço de negociação.
     * @return preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Retorna o volumne negociad que é igual
     * ao preço multiplicado pela quantidade.
     * 
     * @return preco * quantidade
     */
    public double getVolume() {
        return preco * quantidade;
    }
}
