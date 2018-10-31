package com.iesemilidarder.asoto;

import com.iesemilidarder.asoto.data.Car;
import com.iesemilidarder.asoto.data.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * com.iesemilidarder.asoto
 * Class DataHelper
 * By berto. 31/10/2018
 */
public class DataHelper {
    private static List<Vehicle> data = new ArrayList<>();

    public static List<Vehicle> getData(){
        doInit();
        return data;
    }

    private static void doInit(){
        if (data.isEmpty()){
            for(int i =0;i<50;i++){
                Car car = new Car();
                car.setName("Name"+i);
                data.add(car);
            }
        }
    }
}
