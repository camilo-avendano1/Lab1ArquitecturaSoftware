/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.ejb;

import com.udea.models.Vehicles;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jose_waldo
 */
@Stateless
public class VehiclesFacade extends AbstractFacade<Vehicles> implements VehiclesFacadeLocal {

    @PersistenceContext(unitName = "com.udea_Lab1ArquitecturaSoftware-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiclesFacade() {
        super(Vehicles.class);
    }
    
    public List<Vehicles> getAllVehicles() { 
        Query query = em.createNamedQuery("Vehicles.findAll");
        return query.getResultList();
    }
    
}
