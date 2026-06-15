public class App {
    public static void main(String[] args) throws Exception {


       
        int res = runEjercicio1(5);
        System.out.print("suma consecutiva del 5 ");
        System.out.println("es: "+res);

        System.out.println("Ejercicio 2");
        long res2 = runEjercicio2(2,40);
        System.out.println("Respuesta;"+res2);
    }


    // Escribe una funcion recursiva que calcule la suma de 
    //todos los numeros enteros consecutivos desde 1 hasta 
    //un numero dado n. por ejemplo , si n es igual a 5 , 
    // la funcion debe devolver 1+2+3+4+5 = 15
    public static int runEjercicio1(int n){

        // caso base : n = 1
        if (n== 1) {
            return 1;
        }
        // caso recursivo 
        int res = n + runEjercicio1(n-1);
        return res;
    
    }



    // Potencia de un numero: Escribe una funcion recursiva que calcule 
    // la potencia de un numero base elevada a un exponenete entero exponenete.
    //poor ejemplo , si la base es 2 y exponente es 3 , la funcion debe devolver 2 elevada a 3 
    public static long runEjercicio2(long base , long exponente){
        // caso base
        if(exponente == 1){

            return base;
        }
        // caso recursivo 
        return base * runEjercicio2(base, exponente-1);

    }
}
