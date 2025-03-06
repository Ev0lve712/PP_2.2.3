package web.service;

import web.model.Cars;

public class ServiceImpl implements Service {

    @Override
    public void addCar(String name, int year, String color) {
        Cars car = new Cars(name, year, color);
    }

    @Override
    public Cars getCar() {
        return null;
    }
}
