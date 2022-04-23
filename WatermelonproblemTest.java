import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonproblemTest {
    @Test
    public void WatermelonTestermethod1(){
        Watermelonproblem problem1=new Watermelonproblem();
        assertEquals("No",problem1.divisible(5));
    }
    @Test
    public void WatermelonTestermethod2(){
        Watermelonproblem problem1=new Watermelonproblem();
        assertEquals("Yes",problem1.divisible(4));
    }
    @Test
    public void WatermelonTestermethod3(){
        Watermelonproblem problem1=new Watermelonproblem();
        assertEquals("No",problem1.divisible(1));
    }
    @Test
    public void WatermelonTestermethod4(){
        Watermelonproblem problem1=new Watermelonproblem();
        assertEquals("Yes",problem1.divisible(2));
    }
    @Test
    public void EquilibriumTestermethod1(){
        Watermelonproblem problem2=new Watermelonproblem();
        int xvalues[]={1,-1,0};
        int yvalues[]={2,3,-5};
        int zvalues[]={-19,12,7};
        assertEquals("Equilibrium",problem2.equilibrium(3,xvalues,yvalues,zvalues));
    }
    @Test
    public void EquilibriumTestermethod2(){
        Watermelonproblem problem2=new Watermelonproblem();
        int xvalues[]={0,-1,0};
        int yvalues[]={2,3,-5};
        int zvalues[]={-19,12,7};
        assertEquals("Not equilibrium",problem2.equilibrium(3,xvalues,yvalues,zvalues));
    }
    @Test
    public void EquilibriumTestermethod3(){
        Watermelonproblem problem2=new Watermelonproblem();
        int xvalues[]={5,-5,0};
        int yvalues[]={23,37,-60};
        int zvalues[]={105,-85,-20};
        assertEquals("Equilibrium",problem2.equilibrium(3,xvalues,yvalues,zvalues));
    }
    @Test
    public void EquilibriumTestermethod4(){
        Watermelonproblem problem2=new Watermelonproblem();
        int xvalues[]={0,0,0};
        int yvalues[]={0,0,0};
        int zvalues[]={0,0,0};
        assertEquals("Equilibrium",problem2.equilibrium(3,xvalues,yvalues,zvalues));
    }
}