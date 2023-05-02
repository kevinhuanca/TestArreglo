package testarreglo;

public class PruebaArreglo {

    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9};
        int[][] matriz = {{1,2,3},{4,5},{6,7,8,9}};
        String frase = "No renuncies a tus sueños, sigue durmiendo.";
        
        // a)
        System.out.print(".sumarlista(): ");
        Arreglo.sumarLista(arreglo);
        // b)
        System.out.println(".buscarMayor(): " + Arreglo.buscarMayor(matriz));
        // c)
        System.out.println(".cuentaVocales(): " + Arreglo.cuentaVocales(frase));
        // d)
        System.out.println(".cuentaCaracter(): " + Arreglo.cuentaCaracter(frase, 'e') + "\n");
    }
    
}
