package padroescomportamentais.chainofresponsibility;

public class TipoOperacaoCreditoCorporativo implements TipoOperacao {

    private static TipoOperacaoCreditoCorporativo tipoOperacaoCreditoCorporativo = new TipoOperacaoCreditoCorporativo();

    private TipoOperacaoCreditoCorporativo() {};

    public static TipoOperacaoCreditoCorporativo getTipoOperacaoCreditoCorporativo() {
        return tipoOperacaoCreditoCorporativo;
    }

}
