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
public class FerryLine implements Serializable{
    UID ferryLineId;
    String name;    
    int municipalityCode;
    String discountType;
    List<Ferry> ferryList;

    public FerryLine(UID ferryLineId, String name, int municipalityCode, String discountType, List<Ferry> ferryList) {
        this.ferryLineId = ferryLineId;
        this.name = name;
        this.municipalityCode = municipalityCode;
        this.discountType = discountType;
        this.ferryList = ferryList;
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

    public int getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(int municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public List<Ferry> getFerryList() {
        return ferryList;
    }

    public void setFerryList(List<Ferry> ferryList) {
        this.ferryList = ferryList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ferryLineId);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.municipalityCode;
        hash = 37 * hash + Objects.hashCode(this.discountType);
        hash = 37 * hash + Objects.hashCode(this.ferryList);
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
        final FerryLine other = (FerryLine) obj;
        if (this.municipalityCode != other.municipalityCode) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.discountType, other.discountType)) {
            return false;
        }
        if (!Objects.equals(this.ferryLineId, other.ferryLineId)) {
            return false;
        }
        if (!Objects.equals(this.ferryList, other.ferryList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FerryLine{" + "ferryLineId=" + ferryLineId + ", name=" + name + ", municipalityCode=" + municipalityCode + ", discountType=" + discountType + ", ferryList=" + ferryList + '}';
    }

}
