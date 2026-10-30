package padroescomportamentais.chainofresponsibility;

public class TipoOperacaoFinanciamentoVeiculo implements TipoOperacao {

    private static TipoOperacaoFinanciamentoVeiculo tipoOperacaoFinanciamentoVeiculo = new TipoOperacaoFinanciamentoVeiculo();

    private TipoOperacaoFinanciamentoVeiculo() {};

    public static TipoOperacaoFinanciamentoVeiculo getTipoOperacaoFinanciamentoVeiculo() {
        return tipoOperacaoFinanciamentoVeiculo;
    }

}
