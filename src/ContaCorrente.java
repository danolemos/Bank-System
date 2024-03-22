public class ContaCorrente extends Conta {
    double limite;

    ContaCorrente (String numero, Pessoa titular, Data c){
        super(numero, titular, c);
        this.limite = 200;
    }

    double disponivel(){
        return this.saldo + this.limite;
    }

    boolean sacar(double valor){
        if (valor <= this.disponivel()){
            this.saldo -= valor;
            System.out.println("Saque na conta " + this.numero + " realizado com sucesso. Novo saldo: " + this.saldo);
            return true;
        }
        else {
            System.out.println ("ERRO: Saque na conta " + this.numero + " nao foi realizado. Valor disponivel: " + this.disponivel());
            return false;
        }
    }
}