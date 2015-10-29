
import java.util.Random;

public class Labx3 { 


public int GetANumber()
{
	
Random rand = new Random();
return rand.nextInt(10) + 1;

int GetANumber(int high)

Random rand = new Random();
return rand.nextInt(high + 1);

}

public int GetANumber(int lo, int hi)
{
	
Random rand = new Random();
return rand.nextInt(hi - lo + 1) + lo;
}
}

