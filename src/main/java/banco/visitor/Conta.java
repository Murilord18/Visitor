package banco.visitor;


public interface Conta {
    String aceitar(ContaVisitor visitor);
}
