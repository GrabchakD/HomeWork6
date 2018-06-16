package com.dgrabchak.jdbc.model;


import com.dgrabchak.jdbc.dao.annotations.Table;

@Table(name = "CAMERAS")
public class Camera extends Product<Camera> {

    private Integer pix;

    public Camera() {
        super();
    }

    public Camera(Long id, String name, Double price, Integer pix) {
        super(id, name, price);
        this.pix = pix;
    }

    public Integer getPix() {
        return pix;
    }

    public void setPix(Integer pix) {
        this.pix = pix;
    }

    @Override
    public int compareTo(Camera camera) {
        return super.compareTo(camera);
    }
}
