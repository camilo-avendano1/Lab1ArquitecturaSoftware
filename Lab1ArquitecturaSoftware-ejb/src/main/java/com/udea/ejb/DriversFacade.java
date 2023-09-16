/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.ejb;

import com.udea.models.Drivers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jose_waldo
 */
@Stateless
public class DriversFacade extends AbstractFacade<Drivers> implements DriversFacadeLocal {

    @PersistenceContext(unitName = "com.udea_Lab1ArquitecturaSoftware-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DriversFacade() {
        super(Drivers.class);
    }
    
}
