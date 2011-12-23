/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import domain.Coordinates;
import org.hibernate.Session;
import org.hibernate.Query;
import util.HibernateUtil;

/**
 *
 * @author Demo
 */
public class CoordsDaoImpl {
    
   
    public static void addCoord(Coordinates coord) { 
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();        
        session.save(coord);
        session.getTransaction().commit();
        
    }
  
    public static List <Coordinates> getCoords() {
                
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        
        Query query = session.createQuery("from Coordinates");
        
        List result = query.list();
        session.getTransaction().commit();
        
        return result;
    }
    
    public static Coordinates FindCoord(int id) {      
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();        
        Coordinates coord = (Coordinates) HibernateUtil.getSessionFactory()
                                        .getCurrentSession()
                                        .get(Coordinates.class, id);
        
        session.getTransaction().commit();        
        return coord;      
        
    }
  
    public static int getCoordinateCount() {      
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();           
        int count = ((Long)session.createQuery("select count(*) from Coordinates").uniqueResult()).intValue();
        session.getTransaction().commit();        
        return count;      
        
    }
}
