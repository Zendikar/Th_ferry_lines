/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.rmi.server.UID;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Tobias
 */
public class RouteTicket implements Serializable{
    UID ruteId;
    UID ferryLineId;
    LocalDateTime departure;
    String destination;
    long distance;
    String season;

    public RouteTicket(UID ruteId, UID ferryLineId, LocalDateTime departure, String destination, long distance, String season) {
        this.ruteId = ruteId;
        this.ferryLineId = ferryLineId;
        this.departure = departure;
        this.destination = destination;
        this.distance = distance;
        this.season = season;
    }

    public UID getRuteId() {
        return ruteId;
    }

    public void setRuteId(UID ruteId) {
        this.ruteId = ruteId;
    }

    public UID getFerryLineId() {
        return ferryLineId;
    }

    public void setFerryLineId(UID ferryLineId) {
        this.ferryLineId = ferryLineId;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.ruteId);
        hash = 71 * hash + Objects.hashCode(this.ferryLineId);
        hash = 71 * hash + Objects.hashCode(this.departure);
        hash = 71 * hash + Objects.hashCode(this.destination);
        hash = 71 * hash + (int) (this.distance ^ (this.distance >>> 32));
        hash = 71 * hash + Objects.hashCode(this.season);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RouteTicket other = (RouteTicket) obj;
        if (this.distance != other.distance) {
            return false;
        }
        if (!Objects.equals(this.destination, other.destination)) {
            return false;
        }
        if (!Objects.equals(this.season, other.season)) {
            return false;
        }
        if (!Objects.equals(this.ruteId, other.ruteId)) {
            return false;
        }
        if (!Objects.equals(this.ferryLineId, other.ferryLineId)) {
            return false;
        }
        if (!Objects.equals(this.departure, other.departure)) {
            return false;
        }
     
        return true;
    }

    @Override
    public String toString() {
        return "RouteTicket{" + "ruteId=" + ruteId + ", ferryLineId=" + ferryLineId + ", departure=" + departure + ", destination=" + destination + ", distance=" + distance + ", season=" + season + '}';
    }
    
}
