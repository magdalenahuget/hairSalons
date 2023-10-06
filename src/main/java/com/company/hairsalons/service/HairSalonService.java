package com.company.hairsalons.service;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;
import com.company.hairsalons.service.DAO.HairSalonDao;
import com.company.hairsalons.service.DAO.HairdresserDao;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class HairSalonService {

    private final HairSalonDao hairSalonDao;
    private final HairdresserDao hairdresserDao;

    public HairSalonService(HairSalonDao hairSalonDao, HairdresserDao hairdresserDao) {
        this.hairSalonDao = hairSalonDao;
        this.hairdresserDao = hairdresserDao;
    }

    public Set<HairSalon> getHairSalons() {
        return hairSalonDao.getAllHairSalons();
    }

    public void addHairSalon(HairSalon hairSalon) {
        hairSalonDao.addHairSalon(hairSalon);
    }

    public HairSalon getHairSalonById(Long hairSalonId) {
        return hairSalonDao.getHairSalonById(hairSalonId);
    }

    public void deleteHairSalonById(Long hairSalonId) {
        hairSalonDao.deleteHairSalonById(hairSalonId);
    }

    public void addHairdresserToSalon(long hairdresserId, long hairSalonId) {
        HairSalon hairSalon = hairSalonDao.getHairSalonById(hairSalonId);
        Hairdresser hairdresser = hairdresserDao.getHairdresserById(hairdresserId);
        if (hairdresser != null && hairSalon != null) {
            hairdresser.setHairSalon(hairSalon);
            hairSalonDao.addHairdresserToHairSalon(hairdresser, hairSalonId);
        } else {
            System.out.println("no student no room");
        }
    }
}
