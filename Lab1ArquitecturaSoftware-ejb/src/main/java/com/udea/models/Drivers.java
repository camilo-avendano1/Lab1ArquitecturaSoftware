/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.models;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jose_waldo
 */
@Entity
@Table(name = "drivers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drivers.findAll", query = "SELECT d FROM Drivers d"),
    @NamedQuery(name = "Drivers.findByName", query = "SELECT d FROM Drivers d WHERE d.name = :name"),
    @NamedQuery(name = "Drivers.findByLastName", query = "SELECT d FROM Drivers d WHERE d.lastName = :lastName"),
    @NamedQuery(name = "Drivers.findByNIdentification", query = "SELECT d FROM Drivers d WHERE d.nIdentification = :nIdentification"),
    @NamedQuery(name = "Drivers.findByEmail", query = "SELECT d FROM Drivers d WHERE d.email = :email"),
    @NamedQuery(name = "Drivers.findByPhone", query = "SELECT d FROM Drivers d WHERE d.phone = :phone")})
public class Drivers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Id
    @Basic(optional = false)
    @Column(name = "n_identification")
    private String nIdentification;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driverId")
    private Collection<Vehicles> vehiclesCollection;

    public Drivers() {
    }

    public Drivers(String nIdentification) {
        this.nIdentification = nIdentification;
    }

    public Drivers(String nIdentification, String name, String lastName, String email, String phone) {
        this.nIdentification = nIdentification;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNIdentification() {
        return nIdentification;
    }

    public void setNIdentification(String nIdentification) {
        this.nIdentification = nIdentification;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @XmlTransient
    public Collection<Vehicles> getVehiclesCollection() {
        return vehiclesCollection;
    }

    public void setVehiclesCollection(Collection<Vehicles> vehiclesCollection) {
        this.vehiclesCollection = vehiclesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nIdentification != null ? nIdentification.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drivers)) {
            return false;
        }
        Drivers other = (Drivers) object;
        if ((this.nIdentification == null && other.nIdentification != null) || (this.nIdentification != null && !this.nIdentification.equals(other.nIdentification))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.models.Drivers[ nIdentification=" + nIdentification + " ]";
    }
    
}
