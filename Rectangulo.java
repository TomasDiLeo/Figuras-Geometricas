
public class Rectangulo extends Figura {
	private double base;
	private double altura;

	/**
	 * @Condicion base y altura son valores mayores a 0
	 * */
	public Rectangulo(double base, double altura) {
		super();
		
		nombrar("Rectangulo");
		this.base = base;
		this.altura = altura;
	}

	public double perimetro() {
		return 2 * (base + altura);
	}

	public double area() {
		return base * altura;
	}
}
