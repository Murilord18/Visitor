package banco.visitor;


public class ContaPoupanca implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaRendimento) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public String aceitar(ContaVisitor visitor) {
        return visitor.visitarContaPoupanca(this);
    }
}
