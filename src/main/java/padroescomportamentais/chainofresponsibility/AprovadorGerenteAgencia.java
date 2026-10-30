package padroescomportamentais.chainofresponsibility;

public class AprovadorGerenteAgencia extends Aprovador {

    public AprovadorGerenteAgencia(Aprovador superior) {
        listaOperacoes.add(TipoOperacaoFinanciamentoVeiculo.getTipoOperacaoFinanciamentoVeiculo());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente de Agência";
    }

}
