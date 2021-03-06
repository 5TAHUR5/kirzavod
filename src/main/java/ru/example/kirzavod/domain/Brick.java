package ru.example.kirzavod.domain;

import javax.persistence.*;

@Entity
public class Brick {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 64)
    private String name;

    @Column(length = 8)
    private Float price;

    private String img;

    @Column(length = 32)
    private String dimension;


    @Override
    public String toString() {
        return "Id:" + id + ", Name: " + name + ", Price: " + price + ", Dimension: " + dimension + ", Img: " + img;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
