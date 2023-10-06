package com.company.hairsalons.service.DAO;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class HairSalonDaoImpl implements HairSalonDao{

    private final Set<HairSalon> hairSalons;

    public HairSalonDaoImpl(Set<HairSalon> hairSalons) {
        this.hairSalons = hairSalons;
    }

    @Override
    public Set<HairSalon> getAllHairSalons() {
        return this.hairSalons;
    }

    @Override
    public void addHairSalon(HairSalon hairSalon) {
        this.hairSalons.add(hairSalon);
    }

    @Override
    public HairSalon getHairSalonById(long hairSalonId) {
        return hairSalons.stream()
                .filter(hairSalon -> hairSalon.getId() == hairSalonId)
                .findAny()
                .orElse(null);
    }

    @Override
    public void deleteHairSalonById(long hairSalonId) {
        hairSalons.removeIf(hairSalon -> hairSalon.getId() == hairSalonId);
    }

    @Override
    public void addHairdresserToHairSalon(Hairdresser hairdresser, long hairSalonId) {
        HairSalon hairSalon = hairSalons.stream()
                .filter(salon -> salon.getId() == hairSalonId)
                .findAny()
                .orElse(null);
        if(hairSalon != null){
            hairSalon.addHairdresser(hairdresser);
        }
    }
}
