package main;

/**
 *
 * @author ProfDiurno
 */
public class Nif {

    private int numero;
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};
    /**
     * Funcion que calcula la letra del nif en base a su numero
     * @param numero
     * @return 
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }
    /**
     * Constructor por defecto que da un nif invalido
     */
    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }
    /**
     * Constructor que toma el numero nif y calcula la letra
     * @param numero el numero del nif
     */
    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}
