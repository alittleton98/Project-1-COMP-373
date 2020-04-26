package test.java.operationstest;

import main.java.facility.*;
import main.java.operations.*;
import static org.junit.Assert.assertTrue;
import org.junit.*;

public class VisitorTest {
    VisitorImpl testVisitor = new VisitorImpl();
    FacilityManager testFacilityManager = new FacilityManager();
    FacilityOperationsManager testFacilityOpsManager = new FacilityOperationsManager();

    @Test
    public void visitFacilitiesManager() {
        assertTrue(testFacilityManager.accept(testVisitor)); //asserts that passed object was visited
    }

    @Test
    public void visitFacilityOpsManager() {
        assertTrue(testFacilityOpsManager.accept(testVisitor)); //asserts that passed object was visited
    }

   
}