package lista4;

public class Q4 {
	
	public static void main(String[] args) {
		
	}
	
	void bin (int x) {
	if ( x == 0) return;
	bin(x /2);
	printf("%d", x % 2) ;
	void bin(int x1) {
	if (x1 == 0)	{
	printf("0", x1)	;
	return;
		
	}
	
	bin(x1 / 2);
	printf("%d", x1 % 2);
	}
	
	
		
		
	}

	private void printf(String string, int i) {
		// TODO Auto-generated method stub
		
	}
	

}
