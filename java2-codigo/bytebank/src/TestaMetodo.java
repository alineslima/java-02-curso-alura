
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		// se eu não quiser retornar o valor do método saca, seria:
		// contaDoPaulo.saca(20);
		// mas se eu quiser, ficará assim:
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(3000, contaDoPaulo)) {
			System.err.println("tranferencia feita com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		/* ou poderia ter feito o if, desta forma:
		 * boolean sucessoTransferencia = (contaDaMarcela.transfere(3000, contaDoPaulo))
		 * if(sucessoTranferencia){
		 * 		System.err.println("tranferencia feita com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		 */
		
		contaDoPaulo.titular = "paulo silveira";
		System.out.println(contaDoPaulo.titular);
	}

}
