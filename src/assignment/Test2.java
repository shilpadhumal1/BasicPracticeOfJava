package assignment;

public class Test2
{
	public static void main(String[] args) {
		int star = 1;
		int space = 2;
		for (int i = 1; i <= 5; i++) {
			int count =5;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= star; j++) {
				System.out.print(count);
				count--;
			}

			if (i < 3) {
				star=star+2;
				space--;
			} else {
				star=star-2;
				space++;
			}

			System.out.println();

		}

	}


}
