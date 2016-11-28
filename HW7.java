
//Anna Sedlackova, axs1202
import java.util.Random;

public class HW7 {

	private final int keys = 10001;

	// PROBLEM 3
	private void collisionCount(int size) {
		int[] count = new int[size];
		int maxCollision = count[0];
		int numCollisions = 0;

		for (int i = 0; i < keys; i++) {
			int j = i % size;
			count[j]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				numCollisions = numCollisions + (count[i] - 1);

			if ((count[i] - 1) > maxCollision)
				maxCollision = count[i] - 1;
		}

		System.out.println("Number of collisions: " + numCollisions + ", Max Number of collisions: " + maxCollision
				+ ", Size of the array: " + size);
		System.out.println();
	}

	// PROBLEM 4
	private void randomCollisionCount(int size, int numKeys, int keyMax) {
		int[] count = new int[size];
		int maxCollision = count[0];
		int numCollisions = 0;
		int[] keys = new int[numKeys];
		Random r = new Random();

		for (int i = 0; i < keys.length; i++) {
			keys[i] = r.nextInt(keyMax);
		}
		System.out.println();

		for (int i = 0; i < keys.length; i++) {
			int j = keys[i] % size;
			count[j]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)
				numCollisions = numCollisions + (count[i] - 1);

			if ((count[i] - 1) > maxCollision)
				maxCollision = count[i] - 1;
		}

		System.out
				.println("Number of collisions: " + numCollisions + "\n" + "Max Number of collisions:" + maxCollision);
		System.out.println("Size of the array: " + size + ", Total number of keys: " + numKeys
				+ ", Maximum value of keys: " + keyMax);
		System.out.println();

	}

	// Main Method
	public static void main(String[] args) {
		HW7 sample = new HW7();
		// Part 3 a.
		sample.collisionCount(100);
		// Part 3 b.
		sample.collisionCount(200);

		// Part 4 a.
		sample.randomCollisionCount(100, 50, 10000);
		sample.randomCollisionCount(100, 50, 10000);
		sample.randomCollisionCount(100, 50, 10000);
		// Part 4 b.
		sample.randomCollisionCount(200, 50, 10000);
		sample.randomCollisionCount(200, 50, 10000);
		sample.randomCollisionCount(200, 50, 10000);
		// Part 4 c.
		sample.randomCollisionCount(100, 100, 10000);
		sample.randomCollisionCount(100, 100, 10000);
		sample.randomCollisionCount(100, 100, 10000);
		// Part 4 d.
		sample.randomCollisionCount(100, 50, 100000);
		sample.randomCollisionCount(100, 50, 100000);
		sample.randomCollisionCount(100, 50, 100000);
	}
}
