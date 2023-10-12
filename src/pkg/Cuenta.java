package pkg;

import java.util.ArrayList;
import java.util.List;
import pkg.*;

public class Cuenta {
	double saldo;
	private List<Movimiento> MovimientosCuenta;

	public void ingresar(int i) {
		this.saldo += i;
		this.MovimientosCuenta.add(new Movimiento(i,"Ingreso"));
	}

	public void Retirar(int i) {
		if(this.getSaldo() - i >= -500) {
		this.saldo -= i;
		this.MovimientosCuenta.add(new Movimiento(i*(-1),"Retirada"));
		}
		
	}

	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double sald) {
		if (sald >= 0)
		this.saldo = sald;
	}

	public Cuenta(String NumIdetificacion,String titular,double saldo) {
		super();
		this.saldo = saldo;
		this.MovimientosCuenta = new ArrayList<Movimiento>();
	}
	
	

}
