class PoolPuzzleOne {
	public static void main(String[] args) {
		int x = 0;

		while(x < 1) {
			System.out.print("a");
			if (x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (x < 1) {
				System.out.print("oise");
				x = x + 1;
			}
			if ( x > 0) {
				x = x + 2;
			}
			if (x > 3) {
				System.out.print(" oyster");
			}
			System.out.println("");
			System.out.print("an");
		}
	}
}

// output --> a noise
//        --> annoys
//        --> an oyster
