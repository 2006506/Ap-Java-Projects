/* RoachPopulation
	------------
	double _numAlive;
	------------
	Methods:
	double getNumAlive() : shows population
	void spray() : decreases the population by 10%
	void timePasses() : double the population
*/


public class RoachPopulation {
	double _numAlive;
	
	public void RoachPopulation() {
		_numAlive = 100;
	}
	
	public double getNumAlive() {
		return _numAlive;
	}
	
	public void spray() {
		double decrease = 0;
		decrease = _numAlive * .10;
		_numAlive = _numAlive - decrease;
	}
	
	public void timePasses() {
		_numAlive = _numAlive * 2;
	}
}
