package Example1;

 class Ajay{
	public void abc(){
		System.out.println("parent");
	}
}
class  Swathi extends Ajay{
	public void abc()
	{
		super.abc();
		System.out.println("child");
	}
}

 public class Akhil {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swathi a=new Swathi();
		a.abc();
   



	}
	}

