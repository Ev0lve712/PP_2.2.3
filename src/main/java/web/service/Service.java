package web.service;

import web.model.Cars;

public interface Service {
    void addCar(String name, int year, String color);
    Cars getCar();
}
