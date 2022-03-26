
public class Main {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[10];
		int numeroMaximo = 100;
		int random = 0;
		
		for(int i = 0; i < figuras.length; i++) {
			random = (int) (Math.random()*5);
			
			if(random == 0) {
				figuras[i] = new Rectangulo(1+Math.random()*numeroMaximo,1+Math.random()*numeroMaximo);
			}else if(random == 1) {
				figuras[i] = new Cuadrado(1+Math.random()*numeroMaximo);
			}else if(random == 2) {
				figuras[i] = new Elipse(1+Math.random()*numeroMaximo,1+Math.random()*numeroMaximo);
			}else if(random == 3) {
				figuras[i] = new Circulo(1+Math.random()*numeroMaximo);
			}else if(random == 4) {
				figuras[i] = new TrianguloRectangulo(1+Math.random()*numeroMaximo,1+Math.random()*numeroMaximo);
			}
			
			
		}

		printAll(figuras);
	}

	public static void printAll(Figura[] figuras) {
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] != null) {
				System.out.print(i+1 + " : ");
				System.out.println(figuras[i]);
			}				
		}
			
	}

}
