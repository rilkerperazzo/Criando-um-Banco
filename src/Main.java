public class Main {

	public static void main(String[] args) {
		Cliente rilker = new Cliente();
		rilker.setNome("Rilker");
		
		Conta cc = new ContaCorrente(rilker);
		Conta poupanca = new ContaPoupanca(rilker);

		cc.depositar(5000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}