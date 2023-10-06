package com.company.hairsalons.database;

import com.company.hairsalons.model.City;
import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.service.DAO.HairSalonDao;
import org.springframework.stereotype.Component;

@Component
public class HairSalonCreator {

    private final HairSalonDao hairSalonDao;

    public HairSalonCreator(HairSalonDao hairSalonDao) {
        this.hairSalonDao = hairSalonDao;
        createHairSalons();
    }

    private void createHairSalons() {
        HairSalon hairSalonMielno = new HairSalon(1, City.MIELNO, 2, "Mielno 1");
        HairSalon hairSalonZabno = new HairSalon(2, City.ZABNO, 2, "Zabno 1");
        HairSalon hairSalonParis1 = new HairSalon(3, City.PARIS, 2, "Paris 1");
        HairSalon hairSalonParis2 = new HairSalon(4, City.PARIS, 4, "Paris 2");
        hairSalonDao.addHairSalon(hairSalonMielno);
        hairSalonDao.addHairSalon(hairSalonZabno);
        hairSalonDao.addHairSalon(hairSalonParis1);
        hairSalonDao.addHairSalon(hairSalonParis2);
    }
}
