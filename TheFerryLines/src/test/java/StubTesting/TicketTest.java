/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StubTesting;

import DTO.Reservation;
import ETO.ClientNotFoundException;
import Stubs.TicketInterfaceStub;
import java.rmi.server.UID;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Interface.TicketInterface;
import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class TicketTest {

    UID routeId;
    UID ferryLineId;
    LocalDateTime departureDate;
    String destination ;
    long distance ;
    String season ;

    public TicketTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        routeId = new UID();
        ferryLineId = new UID();
        departureDate = LocalDateTime.now();
        departureDate = LocalDateTime.now();
        destination = "Small island";
        distance = 144;
        season = "Summer";

    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetAvailableRoutes() {
        Reservation query = new Reservation(routeId, ferryLineId, departureDate, destination, distance, season);
        TicketInterface instance = new TicketInterfaceStub();
        
        List<Reservation> expResult = new ArrayList<Reservation>();
        expResult.add(query);
        
        List<Reservation> result = instance.getAvailableRoutes(query);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSubmitReservation() {
        Reservation route = new Reservation(routeId, ferryLineId, departureDate, destination, distance, season);

        TicketInterfaceStub instance = new TicketInterfaceStub();
        Reservation expResult = route;

        Reservation result = instance.submitReservation(route);
        assertEquals(expResult, result);
    }
    
    @Test(expected = ClientNotFoundException.class)
    public void submitReservationThrowErr(){
        Reservation route = new Reservation(routeId, ferryLineId, departureDate, destination, distance, season);

        TicketInterfaceStub instance = new TicketInterfaceStub();
        Reservation expResult = route;

        Reservation result = instance.submitReservationThrowErr(route);
    }

}
