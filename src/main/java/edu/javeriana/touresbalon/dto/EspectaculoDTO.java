package edu.javeriana.touresbalon.dto;

import lombok.Builder;

import java.util.List;

@Builder
public class EspectaculoDTO {

    private int id;
    private String image;
    private String name;
    private String description;
    private String category;
    private List<Double> price;

}
