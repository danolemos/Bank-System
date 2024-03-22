public class Pessoa {
    String nome ;
    char sexo;
    int idade ;
    String cpf;

    Pessoa(){
        System.out.println("Nova pessoa criada no sistema.");
    }

    Pessoa (String n, int i, char s, String c){
        System.out.println("Nova pessoa criada no sistema.");
        this.nome = n;
        this.idade = i;
        this.sexo = s;
        this.cpf = c;
    }

    void aniversario(){
        /* Adiciona um ano na idade da pessoa */
        this.idade = this.idade+1;
    }

    void atribuiCPF(String c){
        /* Altera o valor do atributo CPF */
        this.cpf = c;
    }

    int getIdade(){
        /* Retorna o valor da idade da pessoa */
        return this.idade;
    }
}
