package br.pucpcaldas.bolsa.dominio;

import org.joda.time.LocalDate;

public class Candle {
    private final double abertura;
    private final double fechamento;
    private final double minimo;
    private final double maximo;
    private final double volume;
    private final LocalDate data;

    public Candle(double abertura, double fechamento, double minimo, double maximo, double volume, LocalDate data) {
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.minimo = minimo;
        this.maximo = maximo;
        this.volume = volume;
        this.data = data;
    }

}
