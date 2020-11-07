package Assets;

/**
 * retiene movimientos temporalmente
 * @author David de la Hoz
 *
 */
public class MovimientoTotal {

    Movimiento[] mov = new Movimiento[150];

    /**
     * Constructor de la clase MovimientoTotal
     */
    public MovimientoTotal() {

    }

    /**
     * Metodo para obtener el movimiento
     * @return movimiento
     */
    public Movimiento[] getMov() {
        return mov;
    }

    /**
     * Metodo para modifiar el movimiento
     * @param mov
     */
    public void setMov(Movimiento[] mov) {
        this.mov = mov;
    }
}
