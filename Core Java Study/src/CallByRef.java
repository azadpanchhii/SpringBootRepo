
public class CallByRef {

	int data=10;
	public void changeValue(int data)
	{
		this.data=data+10;
	}
	public static void main(String[] args) {
		CallByRef cr=new CallByRef();
		System.out.println("Before calling "+cr.data);
		cr.changeValue(20);
		System.out.println("After calling "+cr.data);		
	}
}
