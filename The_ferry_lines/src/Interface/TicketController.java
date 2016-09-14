/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import DTO.RouteTicket;
import java.util.List;

/**
 *
 * @author Tobias
 */
public interface TicketController {
    List<RouteTicket> getAvailableRoutes(RouteTicket query);
    RouteTicket submitReservation(RouteTicket route);
}
