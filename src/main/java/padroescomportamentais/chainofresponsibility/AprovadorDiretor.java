package padroescomportamentais.chainofresponsibility;

public class AprovadorDiretor extends Aprovador {

    public AprovadorDiretor(Aprovador superior) {
        listaOperacoes.add(TipoOperacaoCreditoCorporativo.getTipoOperacaoCreditoCorporativo());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor Financeiro";
    }

}
