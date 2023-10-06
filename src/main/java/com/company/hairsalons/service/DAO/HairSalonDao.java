package com.company.hairsalons.service.DAO;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;

import java.util.Set;

public interface HairSalonDao {



    Set<HairSalon> getAllHairSalons();

    void addHairSalon(HairSalon hairSalon);

    HairSalon getHairSalonById(long hairSalonId);

    void deleteHairSalonById(long hairSalonId);

    void addHairdresserToHairSalon(Hairdresser hairdresser, long hairSalonId);
}