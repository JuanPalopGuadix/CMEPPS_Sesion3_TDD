package pkg;

public class Cuenta {
	double saldo;

	public void ingresar(int i) {
		this.saldo = 1000;
		
	}

	public void Retirar(int i) {
		this.saldo = 0;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public Cuenta(String NumIdetificacion,String titular,double saldo) {
		super();
		this.saldo = saldo;
	}

}
