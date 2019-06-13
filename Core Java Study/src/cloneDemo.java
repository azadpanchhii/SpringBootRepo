
public class cloneDemo implements Cloneable{

	public int age;
	public String name;
	
	cloneDemo(int a,String n)
	{
		age=a;
		name=n;
	}

	public static void main(String[] args) throws CloneNotSupportedException  {
		cloneDemo cd=new cloneDemo(26, "Deepak");
		cloneDemo copy=(cloneDemo) cd.clone();
		System.out.println("name is ::"+cd.name+" age is ::"+cd.age);
		System.out.println("name is ::"+copy.name+" age is ::"+copy.age);
	}
}
