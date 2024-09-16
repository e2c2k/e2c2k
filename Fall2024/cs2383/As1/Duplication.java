package As1;
import java.util.Random;
/**	Abstract class for CS2383 Assignment 1.
	Examining various approaches for checking an int array for 
	duplicate values. The various approaches have different 
	"Big Oh" behaviour.
	
	@author Andrew McAllister
*/
public abstract class Duplication
{
	// Instance variables
	protected int[] array;
	protected int arraySize;
	protected int minValue;
	protected int maxValue;
	
	// Constructor
	// Creates an array of the given size, filling it
	// with random int values in the range
	// 0..maxValue-1
	public Duplication(int arraySizeIn, int maxValueIn)
	{	arraySize = arraySizeIn;
		array = new int[arraySize];
		minValue = 0;
		maxValue = maxValueIn;
		fillArray();
	}
	
	// Randomly insert numbers in the array. This has the 
	// possibility of producing duplicates.
	private void fillArray()
	{	Random r = new Random();
		for (int i=0; i< array.length; i++)
			array[i] = r.nextInt(maxValue);
	}

	
	// The classes that extend the Duplication class will
	// override this abstract method:
	public abstract boolean containsDuplicate();


	
	// For testing and debugging purposes. This method
	// should never be used with the large arrays used
	// for experimental timings, but it can be useful 
	// with small array sizes to confirm if various
	// approaches for finding duplicates are coded
	// correctly.
	public void displayArray()
	{	for (int i=0; i< array.length; i++)
			System.out.println(i + "\t" + array[i]);

	}

	/** For testing purposes, ensures array contains at least
		one duplicate value.
	*/
	public void createDuplicate()
	{	if (array.length <= 1)
			return;
		Random r = new Random();
		int index1 = r.nextInt(array.length);  // 0 .. length-1
		int index2;
		// Loop to ensure index1 and index2 are not the same
		do {index2 = r.nextInt(array.length);}
			while (index1 == index2);
		// Copy one of the array values, thus creating a
		// duplicate value in the array
		array[index1] = array[index2];
	}
	
} // end of abstract class
