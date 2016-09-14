/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stubs;

import DTO.Person;
import DTO.RouteTicket;
import ETO.RouteNotFoundException;
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
    public RouteTicket submitReservation(RouteTicket route) {
        UID routeId = route.getRuteId();
        UID ferryLineId = route.getFerryLineId();
        LocalDateTime departureDate = route.getDeparture();
        String destination = route.getDestination();
        long distance = route.getDistance();
        String season = route.getSeason();
      
        return new RouteTicket(routeId, ferryLineId, departureDate, destination, distance, season);
    }
    public RouteTicket submitReservationThrowErr(RouteTicket route) throws RouteNotFoundException{
       throw new RouteNotFoundException("Route not found");
    }

    @Override
    public List<RouteTicket> getAvailableRoutes(RouteTicket query) {
        ArrayList listOfTimes = new ArrayList<RouteTicket>();
        listOfTimes.add(query);
        
        return listOfTimes;
    }
    
}
