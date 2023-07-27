
public class InheritanceParent {
	
	public InheritanceParent()
	{
		System.out.println("InheritanceParent Constructor");
	}
	
	//Method overloading example 
	//getData() method is overloaded with different parameter 
	
	public void getData()
	{
		System.out.println("Parent get data");
	}
	
	public void getData(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void getData(int a)
	{
		int c=a;
		System.out.println(c);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		InheritanceParent parent=new InheritanceParent();
		parent.getData();
		parent.getData(1, 2);
		parent.getData(5);
		parent.getData("Hello");
	}

}
