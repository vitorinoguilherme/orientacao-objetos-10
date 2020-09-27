package exemplos;

public class Main {
    public static void main(String[] args) {
        ControleDeBonificacao cdb = new ControleDeBonificacao();
        Funcionario f = new Funcionario();
        cdb.registra(f);

        // Classe Funcionário Abstrata - Não Compila!!!
        //FuncionarioAbs f1 = new FuncionarioAbs();

        Gerente g1 = new Gerente();
        g1.salario = 500;
        System.out.println(g1.getBonificacao());

        Autenticavel a = new Gerente();
        a.autentica(123);

    }
}
