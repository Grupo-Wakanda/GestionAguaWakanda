package com.example.gestionagua;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agua {

    @Id
    private Long id;

    @Column
    private long total;

    @Column
    private long fuga;

    @Column
    private String calidad;

    @Column
    private boolean riego;

    //constructor para verlo desde el smartgrid
    public Agua(long total, long fuga, String calidad, boolean riego) {
        this.total = total;
        this.fuga = fuga; //podemos hacer un porcentaje de fuga segun el total de sensores con fuga
        this.calidad = calidad; //lo mismo
        this.riego = riego;
    }

    public Agua() {}

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getFuga() {
        return fuga;
    }

    public void setFuga(long fuga) {
        this.fuga = fuga;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public boolean isRiego() {
        return riego;
    }

    public void setRiego(boolean riego) {
        this.riego = riego;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
