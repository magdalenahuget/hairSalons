package com.company.hairsalons.service.DAO;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;

import java.util.Set;

public interface HairdresserDao {

    Set<Hairdresser> getAllHairdressers();

    void addHairdresser(Hairdresser hairdresser);

    void removeHairdresser(long hairdresserId);

    Hairdresser getHairdresserById(long hairdresserId);

    void addHairdresserToSalon(HairSalon hairSalon, Hairdresser hairdresser);
}
