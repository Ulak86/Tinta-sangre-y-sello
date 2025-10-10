package pojo;

import java.util.Random;

public class Dado3 {
    private Random random;
    
    public Dado3() {
        random = new Random();
    }
    
    public int lanzar() {
        return random.nextInt(3) + 1;
    }
    
 public static int Dado3()  {
        Dado3 miDado = new Dado3();
        
        // Lanzar el dado varias veces
        for (int i = 0; i < 5; i++) {
            int resultado = miDado.lanzar();
            System.out.println("Lanzamiento " + (i + 1) + ": " + resultado);
        
		return resultado  ;
    }
		return 0;
}
}
