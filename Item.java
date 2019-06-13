/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item {
    // Variable nombre
    String name;
    // Variable peso
    int weigh;
    /**
     * Constructor de objetos Item
     */
    public Item(String nombre, int peso) {
        this.name = nombre;
        this.weigh = peso;
    }

    /**
     * Nombre del item.
     * @return Devuelve el nombre del item.
     */
    public String getNombre() {
        return name;
    }

    /**
     * Devuelve el peso del item.
     * @return Devuelve el peso del item.
     */
    public int getItem() {
        return weigh;
    }

    /**
     * Devuelve una cadena con toda la informacion del item.
     * @return Devuelve una cadena con toda la informacion del item.
     */
    public String getInfo() {
        return name + " " + weigh;
    }
}