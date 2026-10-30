package padroescomportamentais.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class Aprovador {

    protected List<TipoOperacao> listaOperacoes = new ArrayList<>();
    private Aprovador aprovadorSuperior;

    public Aprovador getAprovadorSuperior() {
        return aprovadorSuperior;
    }

    public void setAprovadorSuperior(Aprovador aprovadorSuperior) {
        this.aprovadorSuperior = aprovadorSuperior;
    }

    public abstract String getDescricaoCargo();

    public String aprovarOperacao(OperacaoCredito operacao) {
        if (listaOperacoes.contains(operacao.getTipoOperacao())) {
            return getDescricaoCargo();
        }
        else {
            if (aprovadorSuperior != null) {
                return aprovadorSuperior.aprovarOperacao(operacao);
            }
            else {
                return "Operação não aprovada";
            }
        }
    }
}
