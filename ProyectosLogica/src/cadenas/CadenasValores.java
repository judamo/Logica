package cadenas;

import javax.swing.JOptionPane;

public class CadenasValores {

    public static void main(String[] args) {

        String palabra = "mama";
        String msg = "";
        int indice = 0;
        int tamaño = palabra.length();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        while (indice < tamaño) {

            char c = palabra.charAt(indice);
            switch (c) {

                case 'a':
                    a++;
                    break;

                case 'e':
                    e++;
                    break;

                case 'i':
                    i++;
                    break;

                case 'o':
                    o++;
                    break;

                case 'u':
                    u++;
                    break;

            }

            indice++;
        }
        msg += "la palabra " + palabra + "\n a: " + a + "\n e: " + e + "\n i: " + i + "\n o: " + o + "\n u: " + u + "\n";
        mostrar(msg);

    }

    private static void mostrar(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

}
