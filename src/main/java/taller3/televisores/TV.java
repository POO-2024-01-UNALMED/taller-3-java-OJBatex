package taller3.televisores;

public class TV {
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	
	static int numTV;
	void nuevoTV() {
		numTV++;
	}
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		nuevoTV();
		
	}
	
	public void turnOn() {
		estado = true;
		
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if (estado == true) {
			if (canal < 120) {
				canal++;
			}
		}
		
	}
	
	public void canalDown() {
		if (estado == true) {
			if(canal > 1) {
				canal--;
			}
		}
	}
	
	public void volumenUp() {
		if (estado == true) {
			if (volumen < 7) {
				volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (estado == true) {
			if (volumen > 0) {
				volumen--;
			}
		}
	}
	
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
		
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public boolean getEstado() {
		return estado;
	}

}
