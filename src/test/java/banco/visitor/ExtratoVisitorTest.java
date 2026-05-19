package banco.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ExtratoVisitorTest {

    @Test
    void deveExibirContaCorrente() {
        Agencia agencia = new Agencia(1, "Agência Centro");
        ContaCorrente conta = new ContaCorrente(10001, "Carlos Silva", 2500.00, agencia);

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals(
            "ContaCorrente{numero=10001, titular='Carlos Silva', saldo=R$2500.00, agencia=1}",
            visitor.exibir(conta)
        );
    }

    @Test
    void deveExibirContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca(20002, "Maria Oliveira", 8000.50, 0.5);

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals(
            "ContaPoupanca{numero=20002, titular='Maria Oliveira', saldo=R$8000.50, taxaRendimento=0.5%}",
            visitor.exibir(conta)
        );
    }

    @Test
    void deveExibirContaInvestimento() {
        ContaInvestimento conta = new ContaInvestimento(30003, "João Souza", 50000.00, "CDB");

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals(
            "ContaInvestimento{numero=30003, titular='João Souza', saldo=R$50000.00, tipo='CDB'}",
            visitor.exibir(conta)
        );
    }

    @Test
    void deveExibirContaCorrenteComSaldoZero() {
        Agencia agencia = new Agencia(5, "Agência Sul");
        ContaCorrente conta = new ContaCorrente(10099, "Ana Paula", 0.00, agencia);

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals(
            "ContaCorrente{numero=10099, titular='Ana Paula', saldo=R$0.00, agencia=5}",
            visitor.exibir(conta)
        );
    }

    @Test
    void deveExibirContaInvestimentoTesouroDireto() {
        ContaInvestimento conta = new ContaInvestimento(30099, "Lucas Martins", 15000.75, "Tesouro Direto");

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals(
            "ContaInvestimento{numero=30099, titular='Lucas Martins', saldo=R$15000.75, tipo='Tesouro Direto'}",
            visitor.exibir(conta)
        );
    }
}
