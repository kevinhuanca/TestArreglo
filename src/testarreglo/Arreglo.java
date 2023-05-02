package testarreglo;

public class Arreglo {
    // a)
    public static void sumarLista(int[] arreglo) {
        int suma = 0;
        for (int i : arreglo) {
            suma += i;
        }
        float promedio = (float) suma/arreglo.length;
        System.out.println("suma=" + suma + " y promedio=" + promedio);
    }
    // b)
    public static int buscarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }
    // c)
    public static int cuentaVocales(String frase) {
        int cantidad = 0;
        for (int i=0; i<frase.length(); i++) {
            switch (frase.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cantidad++;
            }
        }
        return cantidad++;
    }
    // d)
    public static int cuentaCaracter(String frase, char letra) {
        int cantidad = 0;
        for (int i=0; i<frase.length(); i++) {
            if (letra == frase.toLowerCase().charAt(i)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    
}
