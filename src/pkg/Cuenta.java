package pkg;

public class Cuenta {
	double saldo;

	public void ingresar(int i) {
		this.saldo =+ i;
		
	}

	public void Retirar(int i) {
		if(i<=this.getSaldo()&&i>0)
		this.saldo =- i;
		
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double sald) {
		if (sald >= 0)
		this.saldo = sald;
	}

	public Cuenta(String NumIdetificacion,String titular,double saldo) {
		super();
		this.saldo = saldo;
	}

}
