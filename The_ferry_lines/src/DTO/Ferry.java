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
import java.util.logging.Logger;

/**
 *
 * @author Tobias
 */
public class Ferry implements Serializable{
    UID ferryId;
    UID ferryLineId;
    String name;
    char size;
    List<Person> passengerList;
    
    /**
     * S = small, M = medium, L = Large
     */

    public Ferry(UID ferryId, UID ferryLineId, String name, char size, List<Person> passengerList) {
        this.ferryId = ferryId;
        this.ferryLineId = ferryLineId;
        this.name = name;
        this.size = size;
        this.passengerList = passengerList;
    }

    public UID getFerryId() {
        return ferryId;
    }

    public void setFerryId(UID ferryId) {
        this.ferryId = ferryId;
    }

    public UID getFerryLineId() {
        return ferryLineId;
    }

    public void setFerryLineId(UID ferryLineId) {
        this.ferryLineId = ferryLineId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public List<Person> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Person> passengerList) {
        this.passengerList = passengerList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ferryId);
        hash = 79 * hash + Objects.hashCode(this.ferryLineId);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.size;
        hash = 79 * hash + Objects.hashCode(this.passengerList);
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
        final Ferry other = (Ferry) obj;
        if (this.size != other.size) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ferryId, other.ferryId)) {
            return false;
        }
        if (!Objects.equals(this.ferryLineId, other.ferryLineId)) {
            return false;
        }
        if (!Objects.equals(this.passengerList, other.passengerList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ferry{" + "ferryId=" + ferryId + ", ferryLineId=" + ferryLineId + ", name=" + name + ", size=" + size + ", passengerList=" + passengerList + '}';
    }
    
}
