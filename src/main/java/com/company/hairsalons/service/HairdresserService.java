package com.company.hairsalons.service;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;
import com.company.hairsalons.service.DAO.HairdresserDao;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HairdresserService {

    private final HairdresserDao hairdresserDao;

    public HairdresserService(HairdresserDao hairdresserDao) {
        this.hairdresserDao = hairdresserDao;
    }

    public Set<Hairdresser> getAllHairdressers() {
        return hairdresserDao.getAllHairdressers();
    }

    public void addHairdresser(Hairdresser student) {
        hairdresserDao.addHairdresser(student);
    }

    public Hairdresser getHairdresserById(long hairdresserId){
        return hairdresserDao.getHairdresserById(hairdresserId);
    }

    public void removeHairdresser(long hairdresserId) {
        hairdresserDao.removeHairdresser(hairdresserId);
    }

    public void addHairdresserToSalon(HairSalon hairSalon, Hairdresser hairdresser) {
        hairdresserDao.addHairdresserToSalon(hairSalon, hairdresser);
    }
}
