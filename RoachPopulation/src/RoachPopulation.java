public class RoachPopulation {

private double population;
private double spray;

public RoachPopulation(double roachStartPopulation)
{
	population = roachStartPopulation;
}
public void breed()
{
	population = population * 2;
}


public void spray(double pct)
{
	spray = pct;
	population = population - (population * spray);
}

public double getRoaches()
{
	return population;
}
}