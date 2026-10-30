package padroescomportamentais.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacaoCreditoTest {

    AprovadorDiretor diretor;
    AprovadorSuperintendente superintendente;
    AprovadorGerenteAgencia gerente;
    AprovadorAnalistaCredito analista;

    @BeforeEach
    void setUp() {
        diretor = new AprovadorDiretor(null);
        superintendente = new AprovadorSuperintendente(diretor);
        gerente = new AprovadorGerenteAgencia(superintendente);
        analista = new AprovadorAnalistaCredito(gerente);
    }

    @Test
    void deveRetornarAnalistaParaCreditoPessoal() {
        assertEquals("Analista de Crédito", analista.aprovarOperacao(new OperacaoCredito(TipoOperacaoCreditoPessoal.getTipoOperacaoCreditoPessoal())));
    }

    @Test
    void deveRetornarGerenteParaFinanciamentoVeiculo() {
        assertEquals("Gerente de Agência", analista.aprovarOperacao(new OperacaoCredito(TipoOperacaoFinanciamentoVeiculo.getTipoOperacaoFinanciamentoVeiculo())));
    }

    @Test
    void deveRetornarSuperintendenteParaFinanciamentoImobiliario() {
        assertEquals("Superintendente Regional", analista.aprovarOperacao(new OperacaoCredito(TipoOperacaoFinanciamentoImobiliario.getTipoOperacaoFinanciamentoImobiliario())));
    }

    @Test
    void deveRetornarDiretorParaCreditoCorporativo() {
        assertEquals("Diretor Financeiro", analista.aprovarOperacao(new OperacaoCredito(TipoOperacaoCreditoCorporativo.getTipoOperacaoCreditoCorporativo())));
    }

    @Test
    void deveRetornarNaoAprovadaParaDerivativos() {
        assertEquals("Operação não aprovada", analista.aprovarOperacao(new OperacaoCredito(TipoOperacaoDerivativos.getTipoOperacaoDerivativos())));
    }

}
