import pojo.Dado21;
import pojo.Dado3;

public class MAIN {

	public static void main(String[] args) {

		Dado3 dado3 = new Dado3();
		for (int i = 0; i < 5; i++) {

			int resultado = dado3.lanzar();
			System.out.println("Lanzamiento " + (i + 1) + ": " + resultado);

		}

		Dado21 dado21 = new Dado21();
		for (int i = 0; i < 21; i++) {

			int resultado = dado21.lanzar();
			System.out.println("Lanzamiento " + (i + 1) + ": " + resultado);
		}
	}
}
