class T
{
	public static void main(String[] args) 
	{
		for(int i=0; i<2; i++)
		{
		System.out.println("loop1 begin" + i);
		for(int j=0; i<5; i++)
			{
				System.out.println("loop2 begin" + "i: " + i + " j: " + j);
				if(j>2)
			    {
			    continue;
				}
			
			System.out.println("loop2 end" + "i: " + i + " j: " + j);
		}
		System.out.println("loop1 end"+ "i: " + i);
	}
	System.out.println("main end");
	}
}
