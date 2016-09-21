/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DTO.Reservation;
import ETO.ClientNotFoundException;
import java.util.List;

/**
 *
 * @author Tobias
 */
public interface TicketInterface {
    List<Reservation> getAvailableRoutes(Reservation query);
    Reservation submitReservation(Reservation route) throws ClientNotFoundException;
}
