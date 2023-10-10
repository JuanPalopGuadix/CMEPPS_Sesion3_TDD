package pkg;

public class Cuenta {
	double saldo;

	public void ingresar(int i) {
		this.saldo =+ i;
		
	}

	public void Retirar(int i) {
		this.saldo =- i;
		
	}

	public double getSaldo() {
		return saldo;
	}

	public Cuenta(String NumIdetificacion,String titular,double saldo) {
		super();
		this.saldo = saldo;
	}

}
