
public class TrianguloRectangulo extends Figura {
	private double cateto1;
	private double cateto2;

	/**
	 * @Condicion cateto1 y cateto2 son valores mayores a 0
	 * */
	public TrianguloRectangulo(double cateto1, double cateto2) {
		super();

		nombrar("Triangulo");
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}

	public double area() {
		return (cateto1 * cateto2)/2;
	}

	public double perimetro() {
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		return hipotenusa + cateto1 + cateto2;
	}

}
