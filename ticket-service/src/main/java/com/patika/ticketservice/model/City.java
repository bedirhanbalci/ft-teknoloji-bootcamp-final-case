package com.patika.ticketservice.model;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cities")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer provinceId;

}
