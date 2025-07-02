package javaProgramacaoOrientadaObjetos.ZZBcomportamento.test;

import javaProgramacaoOrientadaObjetos.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011),new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("----------------------------");
        System.out.println(filterCarByAgeBefore(cars, 2015));

    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carsFiltered = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsFiltered.add(car);
            }
        }
        return carsFiltered;
    }

    private static List<Car> filterCarByAgeBefore(List<Car> cars, int year) {
        List<Car> carsFiltered = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                carsFiltered.add(car);
            }
        }
        return carsFiltered;
    }
}


















