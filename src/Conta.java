public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    Data criacao;

    public Conta (String numero, Pessoa titular, Data c){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        this.criacao = c;
    }

    void depositar (double valor){
        this.saldo += valor;
        System.out.println("Deposito na conta " + this.numero + " realizado com sucesso. Novo saldo: R$" + this.saldo);
    }

    void imprimir_data(Data c){
        if (c.mes < 10){
            System.out.println("Conta de numero " + this.numero + " criada no dia " + c.dia + "/0" + c.mes + "/" + c.ano);
        }
        else{
            System.out.println("Conta de numero " + this.numero + " criada no dia " + c.dia + "/" + c.mes + "/" + c.ano);
        }
    }
}