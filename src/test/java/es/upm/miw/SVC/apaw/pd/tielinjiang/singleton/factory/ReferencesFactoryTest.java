package es.upm.miw.SVC.apaw.pd.tielinjiang.singleton.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;


public class ReferencesFactoryTest {

    @Test
    public void testIsReferencesFactorySingleton() {
        assertSame(ReferencesFactory.getInstance(), ReferencesFactory.getInstance());
    }
    
    @Test
    public void testReferencesFactorySingletonNotNull() {
        assertNotNull(ReferencesFactory.getInstance());
    }
    
    @Test
    public void testReferencesFactory() {
        ReferencesFactory.getInstance().getReference("cero");
        assertEquals(0, ReferencesFactory.getInstance().getReference("cero"));
        assertEquals(1, ReferencesFactory.getInstance().getReference("uno"));
        ReferencesFactory.getInstance().removeReference("cero");
        assertEquals(2, ReferencesFactory.getInstance().getReference("cero"));
    }
    

}
