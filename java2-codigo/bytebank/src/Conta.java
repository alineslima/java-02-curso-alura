class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	void deposita(double valor) {
		// poderia ser: this.saldo += valor;
		saldo = saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			// poderia ser: this.saldo -= valor;
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
					//ou seria:
			destino.deposita(valor);
			return true;
			// ou seria: apenas return false
		} else {
			return false;
		}
	}

}
