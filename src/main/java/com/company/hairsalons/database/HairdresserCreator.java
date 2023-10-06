package com.company.hairsalons.database;

import com.company.hairsalons.model.City;
import com.company.hairsalons.model.Hairdresser;
import com.company.hairsalons.model.HairdresserType;
import com.company.hairsalons.service.DAO.HairdresserDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class HairdresserCreator {

    private final HairdresserDaoImpl hairdresserDaoImpl;

    public HairdresserCreator(HairdresserDaoImpl hairdresserDaoImpl) {
        this.hairdresserDaoImpl = hairdresserDaoImpl;
        createHairdressers();
    }

    private void createHairdressers() {
        Hairdresser legolas = new Hairdresser(1, "Legolas", City.MIELNO, HairdresserType.COLORIST);
        Hairdresser frodo = new Hairdresser(2, "Frodo", City.MIELNO, HairdresserType.CUT_ARTIST);
        Hairdresser gandalf = new Hairdresser(3, "Gandalf", City.PARIS, HairdresserType.BARBER);
        Hairdresser arwena = new Hairdresser(4, "Arwena", City.PARIS, HairdresserType.CUT_ARTIST);
        Hairdresser galadriela = new Hairdresser(5, "Galadriela", City.ZABNO, HairdresserType.GLACA_MASTER);
        Hairdresser aragorn = new Hairdresser(6, "Aragorn", City.ZABNO, HairdresserType.CUT_ARTIST);
        Hairdresser gimli = new Hairdresser(7, "Gimli", City.PARIS, HairdresserType.BARBER);
        hairdresserDaoImpl.addHairdresser(legolas);
        hairdresserDaoImpl.addHairdresser(frodo);
        hairdresserDaoImpl.addHairdresser(gandalf);
        hairdresserDaoImpl.addHairdresser(arwena);
        hairdresserDaoImpl.addHairdresser(galadriela);
        hairdresserDaoImpl.addHairdresser(aragorn);
        hairdresserDaoImpl.addHairdresser(gimli);
    }
}