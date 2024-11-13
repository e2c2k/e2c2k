public class PositionalListTest
{
	public static void main(String[] args)
	{
		LinkedPositionalList<Integer> list = new LinkedPositionalList<Integer>();
		
		Position<Integer> p = null;
		
		final int N = 10;
		
		for(int i = 0; i < N; i++)
			p = list.addLast(Integer.valueOf(i*5));
		
		System.out.println(p.getElement());
		
		System.out.println(list.binarySearch(Integer.valueOf(3)));
		System.out.println(list.binarySearch(Integer.valueOf(15)));
	} // end main
} // end class