
public class Elipse extends Figura {
	protected double a;
	private double b;

	
	/**
	 * @Condicion semiejeMenor y semiejeMayor son valores mayores a 0
	 * */
	public Elipse(double semieje1, double semieje2) {
		super();

		nombrar("Elipse");
		this.a = semieje1;
		this.b = semieje2;

	}

	public double perimetro() {

		// Implementacion de la aproximacion del perimetro de un elipse de Ramanujan
		return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
	}

	public double area() {
		return Math.PI * a * b;
	}
}
