interface one1
{
	void show();
	default void draw()
	{
		System.out.println("Inside draw method");
	}
	static void boo()
	{
		System.out.println("inside boo method");
	}
}
interface two extends one1
{
	void display();
}
public class Inter2 implements two {
	
	@Override
	public void show() {
		System.out.println("Overriden show method");
		
	}
	public static void main(String[] args) {
		Inter2 obj=new Inter2();
		obj.show();
		obj.draw();
		one1.boo();
		Class cls=obj.getClass();
		
		System.out.println("Class is :: "+cls+" hashcode is :: "+obj);
	}
	/*public String toString()
	{
		System.out.println("Hello object");
			return "deepak";
	}*/
	@Override
	public void display() {
		System.out.println("Overriden display method");
		
	}
}
