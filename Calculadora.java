public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int[] numeros) {
        int suma = 0;
        try{
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        } catch (NullPointerException e) {
            System.out.println("Error: El arreglo es null. No se puede realizar la suma.");
        }
        return suma;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.sumar(5, 10);
        int resultado2 = calc.sumar(1, 2, 3);
        double resultado3 = calc.sumar(5.5, 4.3);
        int[] arreglo = {1, 2, 3, 4};
        int resultado4 = calc.sumar(arreglo);
        
        int[] arregloNulo = null;
        int resultadoError = calc.sumar(arregloNulo);
        System.out.println("Resultado con arreglo nulo: " + resultadoError);

        System.out.println("Suma de 5 + 10: " + resultado1);
        System.out.println("Suma de 1 + 2 + 3: " + resultado2);
        System.out.println("Suma de 5.5 + 4.3: " + resultado3);
        System.out.println("Suma de arreglo {1, 2, 3, 4}: " + resultado4);
    }
}
