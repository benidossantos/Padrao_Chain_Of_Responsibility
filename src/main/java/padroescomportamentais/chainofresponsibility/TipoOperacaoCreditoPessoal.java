package padroescomportamentais.chainofresponsibility;

public class TipoOperacaoCreditoPessoal implements TipoOperacao {

    private static TipoOperacaoCreditoPessoal tipoOperacaoCreditoPessoal = new TipoOperacaoCreditoPessoal();

    private TipoOperacaoCreditoPessoal() {};

    public static TipoOperacaoCreditoPessoal getTipoOperacaoCreditoPessoal() {
        return tipoOperacaoCreditoPessoal;
    }

}
