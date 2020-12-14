package machine;

import static org.junit.Assert.*;

import org.junit.Test;

public class MachineAppTest {

	@Test
	public void test() { 
		MachineApp.main(new String[0]);
                assertTrue(true);                
	}
        
        @Test
	public void Machinetest() { 
                TuringMachine turingMachinel = new TuringMachine();
                String prog = "010000110101#010000110101";
                boolean sillentMode = false;
                String actual = MachineApp.runMachine(turingMachinel, prog,sillentMode);
                String expected  = "The input was accepted.";
                assertEquals(expected,actual);
                
                actual = MachineApp.runMachine(turingMachinel,prog,false);
                expected  = "The input was accepted.";
                assertEquals(expected,actual);                
	}

}
