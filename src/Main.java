public class Main {
    public static void main(String[] args) {


        Cliente Poppy = new Cliente();
        Poppy.setNome("Poppy");

        Conta cc = new ContaCorrente(Poppy);
        Conta contapoupanca = new ContaPoupanca(Poppy);


        cc.depositar(100);
        cc.transferir(100, contapoupanca);


        cc.imprimirExtrato();
        contapoupanca.imprimirExtrato();
    }
}
