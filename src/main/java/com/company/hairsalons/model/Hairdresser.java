package com.company.hairsalons.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hairdressers")
public class Hairdresser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(name = "hairdresser_name")
    private String name;

    @Column(name = "city")
    private City city;

    @Column(name = "hairdresser_type")
    private HairdresserType hairdresserType;

    @ManyToOne
    @JoinColumn(name = "hair_salon")
    private HairSalon hairSalon;

    public Hairdresser(long id, String name, City city, HairdresserType hairdresserType) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.hairdresserType = hairdresserType;
        this.hairSalon = null;
    }

    @Override
    public String toString() {
        return name + " - " + hairdresserType;
    }
}
