package net.robertorodriguez.listviewpersonalizado.entidades;

public class Producto {

    private String id;
    private String denominacion;
    private int marca;
    private int unidades;
    private float cantidad;
    private int medida;
    private String imagen;                                        // URL con una imagen del producto

    /**
     * Constructor sin parámetros.
     */
    public Producto() {
    }

    /**
     * Constructor de la clase Producto
     * @param id  el identificador único, debería ser el código de barras de cada producto
     * @param denominacion de cada producto
     * @param marca FK que se corresponde con la clase Marca
     * @param unidades FK que corresponde a la clase Unidades
     * @param cantidad es la cantidad de producto que entra en el producto
     * @param medida FK que corresponde a la clase Medida
     */
    public Producto(
            String id,                                                                      // No null
            String denominacion,                                                          // No null
            int marca,
            int unidades,
            float cantidad,
            int medida,
            String imagen) {

        this.id = id;
        this.denominacion = denominacion;
        this.marca = marca;
        this.unidades = unidades;
        this.cantidad = cantidad;
        this.medida = medida;
        this.imagen = imagen;

    }

    /* ========================================================================================== */
    /* =================================== GETTER AND SETTER ==================================== */
    /* ========================================================================================== */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
