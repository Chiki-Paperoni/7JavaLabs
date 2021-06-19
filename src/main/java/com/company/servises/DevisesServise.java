package com.company.servises;

import com.company.Computer;
import com.company.Laptop;
import com.company.model.DevisesModel;

import java.util.List;

public class DevisesServise {
    private final DevisesModel db = new DevisesModel();

    public int saveComputer() {
        return db.addComputer();
    }
    public int saveLaptop() {
        return db.addLaptop();
    }
    public Computer findComputer(int id) {
        return db.getComputer(id);
    }
    public Laptop findLaptop(int id) {
        return db.getLaptop(id);
    }
    public List<Computer> getComputers() {
        return db.getComputers();
    }
    public List<Laptop> getLaptops() {
        return db.getLaptops();
    }

}
