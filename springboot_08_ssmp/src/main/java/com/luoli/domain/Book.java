package com.luoli.domain;

import lombok.Data;
import lombok.Getter;

//lombok
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
