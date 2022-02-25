package Example1;

public class Extest {
	private int sno;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extest et=new Extest();
		et.setSno(100);
		System.out.println("h");
		System.out.println(et.getSno());
		
		
	}

}
