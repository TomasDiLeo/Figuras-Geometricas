
public abstract class Figura {
	private String nombre;
	
	public Figura() {
		
	}
	
	abstract public double area();
	
	abstract public double perimetro();
	
	final protected void nombrar(String nombre) {
		this.nombre = nombre;
	}
	
	final public boolean menorQue(Figura otraFigura) {		
		return this.area() < otraFigura.area();
	}
	
	final public String toString() {
		return nombre + ": area = " + area() + ", perimetro = " + perimetro();
	}
}
