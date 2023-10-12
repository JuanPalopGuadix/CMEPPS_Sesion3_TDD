package pkg;

public class Movimiento {
	
	private double importe;
	//public enum Signo {D, H}
	private String detalle;
	//private Signo sig;
	
	
	public Movimiento(double importe, String detalle) {//, Signo sig
		super();
		this.importe = importe;
		this.detalle = detalle;
		//this.sig = sig;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	/*
	public Signo getSig() {
		return sig;
	}
	public void setSig(Signo sig) {
		this.sig = sig;
	}
	*/
	
}
