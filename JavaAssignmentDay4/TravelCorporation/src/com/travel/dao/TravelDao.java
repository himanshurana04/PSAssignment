package com.travel.dao;
import java.util.ArrayList;

import com.travel.bean.*;

/*XYZ Travel Corporation plans to automate its ticket booking system. Currently XYZ
Travel Corporation operates in 3 routes with 3 different buses. The travel
manager should be able to do the following in the application.
1. View all buses with details
2. When passenger calls in to check the availability, Travel manager gets the source and
destination from the passenger and checks the availability of bus. If available,
passenger’s name and age are collected. Bus and seat number are allocated to the
passenger. If all the seats are allocated, passenger will not be given a ticket.
Travel manager should be able to view the passengers for a given bus number.

*/
public interface TravelDao {
ArrayList<Travel> listAllBus();
ArrayList<Passenger> listAllPassenger();
boolean checkAvailability(String source,String destination);
int addPassenger(Passenger passenger);
//int updateCapacity(int noOfPassenger);


}
