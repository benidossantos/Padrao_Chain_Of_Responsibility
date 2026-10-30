package padroescomportamentais.chainofresponsibility;

public class TipoOperacaoDerivativos implements TipoOperacao {

    private static TipoOperacaoDerivativos tipoOperacaoDerivativos = new TipoOperacaoDerivativos();

    private TipoOperacaoDerivativos() {};

    public static TipoOperacaoDerivativos getTipoOperacaoDerivativos() {
        return tipoOperacaoDerivativos;
    }

}
