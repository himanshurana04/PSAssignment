package com.travel.service;

import java.util.ArrayList;


import com.travel.bean.*;

public interface TravelService {
boolean checkForBusAvailibility(String source,String destination);
ArrayList<Travel> listOfAllBus();
ArrayList<Passenger> listOfAllPassenger();
boolean addPassenger(Passenger passenger);
}
