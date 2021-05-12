/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import exceptions.EstacionamentoFechadoException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * <p>
 * Classe <b>AcessoMensalista </b> </p>
 * <p>
 * Define a estrutura de um acesso de um mensalista na Aplicação</p>
 * <p>
 * Herda atributo e métodos da classe abstrata Acesso</p>
 *
 * @author Lucas Ramon
 * @since may 2021
 * @version 1.0
 */
public class AcessoMensalista extends Acesso {

    /**
     * Construtor default da classe  <b>AcessoMensalista</b> <br><br>
     * <b> uso:</b> <br>
     * AcessoMensalista acesso = new AcessoMensalista();
     */
    public AcessoMensalista() {
        this.valor = 0;
        this.tarifa = 500;
    }

    /**
     * <b>método</b> calculaValor<br>
     * <b>uso:</b> <br>
     * acessoMensalista.calculaValor();<br>
     * Este método calcula o custo de um acesso mensalista.
     *
     * @param duracao faz referência a duracao do acesso
     * @param tarifa faz referência a tarifa aplicada no calculo do custo
     * @return <b>double:</b> custo do acesso
     */
    @Override
    public double calculaValor(Duration duracao, double tarifa) {
        return 0;
    }

    /**
     * Setter do atributo <b>entrada</b><br>
     * <b>uso:</b><br>
     * acesso.setEntrada(LocalDate dia, LocalTime hora);
     *
     * @param dia faz referência a data da entrada do acesso.
     * @param hora faz referência a hora da entrada do acesso.
     * @throws EstacionamentoFechadoException Não é possivel atribuir o mesmo
     * dia e hora da entrada a saida.
     */
    @Override
    public void setEntrada(LocalDate dia, LocalTime hora) throws EstacionamentoFechadoException {
        LocalDateTime entrada = LocalDateTime.of(dia, hora);
        this.entrada = entrada;
    }

}
