/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.rmi.server.UID;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Tobias
 */
public class Person implements Serializable{
    UID personId;
    int municipalityCode;
    List<RouteTicket> routeTickets;

    public Person(UID personId, int municipalityCode, List<RouteTicket> routeTickets) {
        this.personId = personId;
        this.municipalityCode = municipalityCode;
        this.routeTickets = routeTickets;
    }

    public UID getPersonId() {
        return personId;
    }

    public void setPersonId(UID personId) {
        this.personId = personId;
    }

    public int getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(int municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    public List<RouteTicket> getRouteTickets() {
        return routeTickets;
    }

    public void setRouteTickets(List<RouteTicket> routeTickets) {
        this.routeTickets = routeTickets;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.personId);
        hash = 23 * hash + this.municipalityCode;
        hash = 23 * hash + Objects.hashCode(this.routeTickets);
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
        final Person other = (Person) obj;
        if (this.municipalityCode != other.municipalityCode) {
            return false;
        }
        if (!Objects.equals(this.personId, other.personId)) {
            return false;
        }
        if (!Objects.equals(this.routeTickets, other.routeTickets)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "personId=" + personId + ", municipalityCode=" + municipalityCode + ", routeTickets=" + routeTickets + '}';
    }
    
}
