import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void runSimulation() {
        Simulation sim = new Simulation(5, 100000f);
        sim.runSimulation();
        System.out.println(sim.printResults());
    }
}