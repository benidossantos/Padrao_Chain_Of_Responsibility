package padroescomportamentais.chainofresponsibility;

public class AprovadorSuperintendente extends Aprovador {

    public AprovadorSuperintendente(Aprovador superior) {
        listaOperacoes.add(TipoOperacaoFinanciamentoImobiliario.getTipoOperacaoFinanciamentoImobiliario());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Superintendente Regional";
    }

}
