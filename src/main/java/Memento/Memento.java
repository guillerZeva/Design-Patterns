package Memento;

public class Memento {

    private Object estado;

    public Memento(Object estado) {
        this.estado = estado;
    }

    public Object getMementoEstado() {
        return estado;
    }

}
