package co.com.superapp.utils;

public class WebUtils {

    /**
     * Este metodo realiza esperas explicitas en la automatizacion, ideal para casos en los que no tenemos un objeto
     * que identificar o si el sistema lo reconoce internamente y no es posible interactuar con el.
     * El metodo recibe como unico parametro el numero de segundos que se desa esperar.
     * Procurar no usar esperas tan prologangadas ya que el sistema si o si esperara el tiempo indicado.
     *
     * @param seconds tiempo en segudos en el que se ejecuta la espera explicita
     */

    public static void esperar(int seconds) {
        int milliseconds = seconds * 1000;
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
