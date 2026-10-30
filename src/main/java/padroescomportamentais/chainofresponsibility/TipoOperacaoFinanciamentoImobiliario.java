package padroescomportamentais.chainofresponsibility;

public class TipoOperacaoFinanciamentoImobiliario implements TipoOperacao {

    private static TipoOperacaoFinanciamentoImobiliario tipoOperacaoFinanciamentoImobiliario = new TipoOperacaoFinanciamentoImobiliario();

    private TipoOperacaoFinanciamentoImobiliario() {};

    public static TipoOperacaoFinanciamentoImobiliario getTipoOperacaoFinanciamentoImobiliario() {
        return tipoOperacaoFinanciamentoImobiliario;
    }

}
