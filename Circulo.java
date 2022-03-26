
public class Circulo extends Elipse {
	
	/**
	 * @Condicion radio es un valor mayor a 0
	 * */
	public Circulo(double radio) {
		super(radio, radio);
		nombrar("Circulo");
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.a;
	}
}
