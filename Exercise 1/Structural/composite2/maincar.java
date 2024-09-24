package composite2;
public class maincar {

    public static void main(String[] args) {
    car_components turbo = new car_leaf(150000, "Turbo");
    car_components cylinder = new car_leaf(55000, "Cylinder(NO2)");
    car_components alloy = new car_leaf(400000, "alloy");
    car_components tire = new car_leaf(200000, "Tire");
    car_components ventilated = new car_leaf(19000, "Ventilated");
    car_components musicSystem = new car_leaf(40000, "Infotainment");


    car_composite engine = new car_composite("Engine");
    car_composite wheel  = new car_composite("Wheels");
    car_composite interior = new car_composite("Interior");
    car_composite car = new car_composite("CAR");
    car_composite seats = new car_composite("Seats");

    car.addcarcomponent(engine);
    car.addcarcomponent(wheel);
    car.addcarcomponent(interior);

    engine.addcarcomponent(turbo);
    engine.addcarcomponent(cylinder);

    wheel.addcarcomponent(alloy);
    wheel.addcarcomponent(tire);

    interior.addcarcomponent(musicSystem);
    interior.addcarcomponent(seats);

    seats.addcarcomponent(ventilated);
    car.showPrice();

}}
