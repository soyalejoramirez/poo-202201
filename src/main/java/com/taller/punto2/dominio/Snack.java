package com.taller.punto2.dominio;

public class Snack {
    public static final short CANTIDAD_MAXIMA_DEL_MISMO_SNACK = 6;
    private static int id = 1000;
    private int codigo;
    private String nombre;
    private short unidades;
    private int valor;

    public Snack(String nombre, short unidades, int valor) {
        int siguienteCodigo = Snack.id + 1;
        Snack.id++;

        this.codigo = siguienteCodigo;
        this.nombre = nombre;
        this.unidades = unidades;
        this.valor = valor;
    }

    public void aumentarUnidades(short unidadesAAumentar) {
        if ((this.unidades + unidadesAAumentar) > CANTIDAD_MAXIMA_DEL_MISMO_SNACK) {
            System.out.println("No se puede incluir esa cantidad al snack " + this.nombre);
        } else {
            this.unidades += unidadesAAumentar;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public short getUnidades() {
        return unidades;
    }

    public int getValor() {
        return valor;
    }

    public void setUnidades(short unidades) {
        this.unidades = unidades;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
