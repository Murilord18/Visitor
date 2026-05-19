package banco.visitor;

import java.util.Locale;


public class ExtratoVisitor implements ContaVisitor {

    public String exibir(Conta conta) {
        return conta.aceitar(this);
    }

    @Override
    public String visitarContaCorrente(ContaCorrente conta) {
        return "ContaCorrente{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + '\'' +
                ", saldo=R$" + String.format(Locale.US, "%.2f", conta.getSaldo()) +
                ", agencia=" + conta.getNumeroAgencia() +
                '}';
    }

    @Override
    public String visitarContaPoupanca(ContaPoupanca conta) {
        return "ContaPoupanca{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + '\'' +
                ", saldo=R$" + String.format(Locale.US, "%.2f", conta.getSaldo()) +
                ", taxaRendimento=" + conta.getTaxaRendimento() + "%" +
                '}';
    }

    @Override
    public String visitarContaInvestimento(ContaInvestimento conta) {
        return "ContaInvestimento{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + '\'' +
                ", saldo=R$" + String.format(Locale.US, "%.2f", conta.getSaldo()) +
                ", tipo='" + conta.getTipoInvestimento() + '\'' +
                '}';
    }
}
