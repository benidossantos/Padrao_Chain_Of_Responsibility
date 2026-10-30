package padroescomportamentais.chainofresponsibility;

public class OperacaoCredito {

    private TipoOperacao tipoOperacao;

    public OperacaoCredito(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

}
