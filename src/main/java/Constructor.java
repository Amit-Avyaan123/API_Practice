
public class Constructor {
	
	public Constructor()
	{
		System.out.println("this is non parametrize constructor");
	}
	
	public Constructor(int a,int b)
	{
		System.out.println("this is parametrized constructor");
		System.out.println("Value of a = " +a);
		System.out.println("Value of a = " +b);
	}

	public static void main(String args[])
	{
		Constructor pc=new Constructor(1,2);
		Constructor nc=new Constructor();
		
	}

}
