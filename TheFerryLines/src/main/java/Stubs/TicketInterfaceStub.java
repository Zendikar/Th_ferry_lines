/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stubs;

import DTO.Client;
import DTO.Reservation;
import ETO.FerryNotFoundException;
import java.rmi.server.UID;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import Interface.TicketInterface;

/**
 *
 * @author raul
 */
public class TicketInterfaceStub implements TicketInterface{

    @Override
    public Reservation submitReservation(Reservation route) {
        UID routeId = route.getRuteId();
        UID ferryLineId = route.getFerryLineId();
        LocalDateTime departureDate = route.getDeparture();
        String destination = route.getDestination();
        long distance = route.getDistance();
        String season = route.getSeason();
      
        return new Reservation(routeId, ferryLineId, departureDate, destination, distance, season);
    }
    public Reservation submitReservationThrowErr(Reservation route) throws FerryNotFoundException{
       throw new FerryNotFoundException("Route not found");
    }

    @Override
    public List<Reservation> getAvailableRoutes(Reservation query) {
        ArrayList listOfTimes = new ArrayList<Reservation>();
        listOfTimes.add(query);
        
        return listOfTimes;
    }
    
}
