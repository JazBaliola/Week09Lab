package dataaccess;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jaz Baliola
 */
public class DBUtil {
    private static final EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("UsersPU");
    
    public static EntityManagerFactory getEmFactory(){
        return emf;
    }
}