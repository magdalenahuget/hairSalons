package com.company.hairsalons.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="salons")
public class HairSalon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salon_id")
    private long id;

    @Column(name = "city")
    private City city;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "salon_name")
    private String salonName;

    @OneToMany(mappedBy = "salon")
    private Set<Hairdresser> hairdressers;

    public HairSalon(long id, City city, int capacity, String salonName) {
        this.id = id;
        this.city = city;
        this.capacity = capacity;
        this.salonName = salonName;
        this.hairdressers = new HashSet<>();
    }

    public void addHairdresser(Hairdresser hairdresser) {
        hairdresser.setHairSalon(this);
        hairdressers.add(hairdresser);
    }

    public void removeHairdresser(Hairdresser hairdresser) {
        hairdresser.setHairSalon(null);
        hairdressers.remove(hairdresser);
    }

    @Override
    public String toString() {
        return salonName;
    }
}