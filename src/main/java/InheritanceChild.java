
public class InheritanceChild extends InheritanceParent {
	
	int a;
	int b;

	public InheritanceChild()
	{
		super();
		System.out.println("InheritanceChild Constructor");
		
	}
	
	//Parametrized constructor
	public InheritanceChild(int a,int b)
	{
		this.a=a+1;
		this.b=b+2;	
         
         System.out.println(this.a);
         System.out.println(this.b);
	}
	
	public void getData()
	{
		System.out.println("Child get data");
		super.getData(); // will call parent getData() method using super keyword
	}
	
	
	public static void main(String args[])
	{
		
		InheritanceChild child=new InheritanceChild();
		child.getData();
		InheritanceChild childpc=new InheritanceChild(2,3);
				
	}

} 
