class V 
{
	public static void main(String[] args) 
	{
		int i=0;
		int	j=++i + i-- + ++i + i + // 1 + 1 + 1 +1 =4
			i-- + i + --i + i +// 1 + 0 + -1 + -1= -1
			++i + i++ + --i + i +//0 +0 + 0 + 0=0
			--i + i + i-- + i +//-1 + -1 + -1 + -2=-5
			++i + --i + ++i + i +// -1 + -2 + -1 + -1 =-5
			--i + i + --i + i +//-2 + -2 + -3 + -3= -10
			++i + i++ + --i + i +//-2 + -2 + -2 + -2= -8
			i-- + i + i-- + i;//-2 +3 + -3 + -4 =-12
		System.out.println(i);
		System.out.println(j);
	}
}
