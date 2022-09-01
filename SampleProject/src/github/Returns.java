package github;

public class Returns {
	int a=10;
	int b=11;
	public int sum() {
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		Returns rr=new Returns();
		int y = rr.sum();
		System.out.println(y);
	}
}

