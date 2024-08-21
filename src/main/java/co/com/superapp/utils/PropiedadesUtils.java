package co.com.superapp.utils;

import java.io.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropiedadesUtils {
    private static Properties propiedades;

    /**
     * Este metodo lee un archivo tipo properties y lo deja guardado en la variable estatica properties.
     *
     * @param nombreArchivo ruta del archivo que se va a leer
     */
    public static void configuracionPropiedades(String nombreArchivo) {
        try {
            propiedades = new Properties();
            propiedades.load(new BufferedReader(new FileReader(nombreArchivo)));
        } catch (Exception e) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Hubo un error mientras se leia el archivo de propiedades en la ruta: " + nombreArchivo + ".\n" + e.getMessage());
        }
    }

    /**
     * Este metodo retorna el valor de una propiedad especifica en un archivo tipo properties.
     *
     * @param nombreArchivo ruta del archivo sobre el que se va a obtener el valor.
     * @param llave         nombre de la propiedad que se va a leer.
     * @return valor de la propiedad.
     */
    public static String getValorPropiedades(String nombreArchivo, String llave) {
        try {
            configuracionPropiedades(nombreArchivo);
            return propiedades.getProperty(llave);
        } catch (Exception e) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Hubo un error mientras se obtenia el valor de la propiedad: " + llave + " del archivo de propiedades en la ruta: " + nombreArchivo + ".\n" + e.getMessage());
            return "No se pudo capturar el valor de la propiedad: ".concat(llave);
        }
    }

    /**
     * Este metodo modifica una propiedad existente de un archivo tipo properties.
     *
     * @param nombreArchivo ruta del archivo sobre el que se va a realizar el cambio.
     * @param llave         nombre de la propiedad que se va a modificar.
     * @param valor         valor que se le va a asignar a la propiedad.
     */
    public static void setValorPropiedades(String nombreArchivo, String llave, String valor) {
        try {
            configuracionPropiedades(nombreArchivo);
            propiedades.setProperty(llave, valor);
            crearPropiedades(nombreArchivo);
        } catch (Exception e) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Hubo un error mientras se escribia la propiedad: " + llave + " con valor: " + valor + " al archivo de propiedades en la ruta: " + nombreArchivo + ".\n" + e.getMessage());
        }
    }

    /**
     * Este metodo guarda los cambios que se hayan realizado sobre un archivo properties
     *
     * @param fileName ruta del archvio que se requiere modificar.
     */
    public static void crearPropiedades(String fileName) {
        try {
            propiedades.store(new BufferedWriter(new FileWriter(fileName)), "Cambio en el propiedades");
        } catch (IOException e) {
            Logger.getAnonymousLogger().log(Level.WARNING, "Hubo un error mientras se creaba el archivo de propiedades en la ruta: " + fileName + ".\n" + e.getMessage());

        }
    }
}