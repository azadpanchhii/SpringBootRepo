
interface one
{
	void show();
	int a=5;
}
public class Inter1 implements one{

	public void show()
	{
		System.out.println("Overriden show method");
	}
	
	public static void main(String[] args) {
		one obj=new one() {
			public void show()
			{
				System.out.println("overriden show");
			}
		};
		obj.show();
	}
}
