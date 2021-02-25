package br.pucpcaldas.bolsa;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.Test;

import br.pucpcaldas.bolsa.dominio.Negocio;

/**
 * Testa o calculo do volume de um negócio.
 */
public class TestaCalculoDoVolume 
{
   
    @Test
     public void deveRetornarMultiplicacaoDoPrecoPelaQuantidade()
    {
        // Arranjo
        Negocio umNegocio = new Negocio(1.50, 4, new LocalDate("2021-02-26"));

        // Açao
        double volumeCalculado = umNegocio.getVolume();
        
        // Asserção
        assertEquals(6.0, volumeCalculado, 0.01);
        System.out.println(umNegocio.getData());
        
    }
}
