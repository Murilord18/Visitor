package banco.visitor;


public interface ContaVisitor {
    String visitarContaCorrente(ContaCorrente conta);
    String visitarContaPoupanca(ContaPoupanca conta);
    String visitarContaInvestimento(ContaInvestimento conta);
}
