package com.company.hairsalons.service.DAO;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class HairdresserDaoImpl implements HairdresserDao {

    private final Set<Hairdresser> hairdressers;

    public HairdresserDaoImpl(Set<Hairdresser> hairdressers) {
        this.hairdressers = hairdressers;
    }

    @Override
    public Set<Hairdresser> getAllHairdressers() {
        return hairdressers;
    }

    @Override
    public void addHairdresser(Hairdresser hairdresser) {
        this.hairdressers.add(hairdresser);
    }

    @Override
    public void removeHairdresser(long hairdresserId) {
        this.hairdressers.removeIf(hairdresser -> hairdresser.getId() == hairdresserId);
    }

    @Override
    public Hairdresser getHairdresserById(long hairdresserId) {
        return this.hairdressers.stream()
                .filter(hairdresser -> hairdresser.getId() == hairdresserId)
                .findAny()
                .orElse(null);
    }

    @Override
    public void addHairdresserToSalon(HairSalon hairSalon, Hairdresser hairdresser) {
        hairdresser.setHairSalon(hairSalon);
    }
}
