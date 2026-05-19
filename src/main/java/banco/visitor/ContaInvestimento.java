package banco.visitor;


public class ContaInvestimento implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private String tipoInvestimento;

    public ContaInvestimento(int numero, String titular, double saldo, String tipoInvestimento) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoInvestimento = tipoInvestimento;
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

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    @Override
    public String aceitar(ContaVisitor visitor) {
        return visitor.visitarContaInvestimento(this);
    }
}
