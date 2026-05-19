package banco.visitor;


public class ContaCorrente implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private Agencia agencia;

    public ContaCorrente(int numero, String titular, double saldo, Agencia agencia) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
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

    public int getNumeroAgencia() {
        return agencia.getNumero();
    }

    @Override
    public String aceitar(ContaVisitor visitor) {
        return visitor.visitarContaCorrente(this);
    }
}
