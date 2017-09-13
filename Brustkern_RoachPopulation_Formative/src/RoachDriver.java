
public class RoachDriver {

	public static void main(String[] args) {
		RoachPopulation population = new RoachPopulation();
		population.RoachPopulation();
		
		System.out.println(" Roach Simulator");
		System.out.println("-------------------");
		System.out.println("Population: " + population.getNumAlive());
		
		population.timePasses();
		
		System.out.println("Time passes...\nPopulation: " + population.getNumAlive());
		
		population.spray();
		
		System.out.println("Spraying Population...\nPopulation: " + population.getNumAlive());
		
		population.spray();
		
		System.out.println("Spraying Population...\nPopulation: " + population.getNumAlive());
		
		population.timePasses();
		
		System.out.println("Time passes...\nPopulation: " + population.getNumAlive());

	}

}

/* Predicted Output:
 * Roach Simulator
 * ----------------
 * Population: 100
 * TimePasses...
 * Population: 200
 * Spraying Population...
 * Population: 180
 * Spraying Population...
 * Population: 162
 * Time Passes: 
 * Population: 324
 * 
 * Actual Output:
 * 
 *  Roach Simulator
-------------------
Population: 100.0
Time passes...
Population: 200.0
Spraying Population...
Population: 180.0
Spraying Population...
Population: 162.0
Time passes...
Population: 324.0
 */
