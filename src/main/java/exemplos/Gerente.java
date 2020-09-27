package exemplos;

public class Gerente extends FuncionarioAbs implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha != senha) {
            return false;
        }
        return true;
    }
}
