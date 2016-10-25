package fcu.iecs.oop.tiida;

public class NissanTiida 
{
	public void tiida(int i)
	{
		int n, m ;
		
		for(n = 0 ; n < i ; n++)
		{
			for(m = 0 ; m < i ; m++)
			{
				System.out.print("*") ;
			}
			
			System.out.printf("\n") ;
		}
		
		System.out.printf("\n") ;
	}
}