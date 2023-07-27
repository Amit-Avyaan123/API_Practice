
public class Thisdemo {
	
	int a=2;
	
	public void getdata()
	{
		int a=3;
		System.out.println("Value of a inside method is = " +a);
		System.out.println("Value of a in class is = " +this.a);
	}

	public static void main(String args[])
	{
		Thisdemo t=new Thisdemo();
		t.getdata();
		System.out.println("class variable a is =" +t.a);
				
	}

}
