package com.ciclo3.reto.retog5.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="room")

public class Ortopedic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String brand;
    private int year;
    private String description;
    @ManyToOne
    @JoinColumn(name="category_id")
    @JsonIgnoreProperties("Ortopedics")
    private Category category;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "ortopedic")
    @JsonIgnoreProperties({"Ortopedic","client"})
    private List<Message> messages;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "ortopedic")
    @JsonIgnoreProperties({"Ortopedic","messages"})
    private List<Reservation> reservations;
}
