
public class CriaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		CriaTitular vitor = new CriaTitular();
		vitor.setNome("VITOR NILSON");
		conta.setTitular(vitor);
		
		
		conta.deposita(100);

		System.out.println(conta.getSaldo());
		System.out.println(conta.getTitular().getNome());
	}

}
