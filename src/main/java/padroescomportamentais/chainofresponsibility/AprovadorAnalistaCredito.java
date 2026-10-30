package padroescomportamentais.chainofresponsibility;

public class AprovadorAnalistaCredito extends Aprovador {

    public AprovadorAnalistaCredito(Aprovador superior) {
        listaOperacoes.add(TipoOperacaoCreditoPessoal.getTipoOperacaoCreditoPessoal());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista de Crédito";
    }

}
