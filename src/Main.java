public static void main(String[] args){
    Pessoa p1 = new Pessoa("Daniel", 21, 'M',"123-4");
    Pessoa p2 = new Pessoa("Alessandra", 50, 'F', "123-5");

    ContaCorrente c1 = new ContaCorrente("001", p1, new Data(12, 3, 2019));
    c1.imprimir_data(c1.criacao);
    ContaCorrente c2 = new ContaCorrente("002", p2, new Data(13, 3, 2019));
    c2.imprimir_data(c2.criacao);

    c1.sacar(150);
    c1.sacar(100);
    c1.depositar(100);
}