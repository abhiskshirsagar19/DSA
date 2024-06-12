package SubArrays;

/*
 A wire connects N light bulbs.

Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on. 
  
  
 */
public class Bulbs {
	public int countSwitch(int A[]) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if ((count % 2 == 0 && A[i] == 1) || (count % 2 == 1 && A[i] == 0)) {
				continue;
			} else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = { 0, 1, 0 };
		Bulbs b = new Bulbs();
		System.out.println(b.countSwitch(A));;
	}

}
