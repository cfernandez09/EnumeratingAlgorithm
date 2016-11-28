//Anna Sedlackova axs1202
public class HW8 {

	final static  int size = 20;

	// PROBLEM 2
	// creating string array and int array
	 static Integer[] intArray = new Integer[size];
	 static String[] stringArray = new String[size];

	// function to insert into the two arrays using quadratic probing
	public void quadraticProbing(String s, Integer n) {
		int hashKey = n % size;
		int i = 1;

		while (intArray[hashKey] != null && stringArray[hashKey] != null) {
			hashKey = (n % size) + (i * i);
			if (hashKey >= intArray.length && hashKey >= stringArray.length)
				hashKey = hashKey - size;
			i++;
		}

		stringArray[hashKey] = s;
		intArray[hashKey] = n;
	}

	// PROBLEM 3
	// creating string array and int array
	static Integer[] intArray2 = new Integer[size];
	static String[] stringArray2 = new String[size];

	// function to insert into an array using double hashing
	public void doubleHashing(String s, Integer n) {
		int hashKey = n % size;
		int hash2Key = 7 - (n % 7);
		int i = 1;

		while (intArray2[hashKey] != null && stringArray2[hashKey] != null) {
			hashKey = (n % size) + (i * hash2Key);
			if (hashKey >= intArray2.length && hashKey >= stringArray2.length)
				hashKey = hashKey - size;
			i++;
		}

		stringArray2[hashKey] = s;
		intArray2[hashKey] = n;
	}

	// function to print the double array
	public void print(Integer[] intArray, String[] sArray) {
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i + ": " + intArray[i] + ", " + sArray[i]);
		}
	}

	// main method
	public static void main(String[] args) {
		HW8 test = new HW8();
		test.quadraticProbing("Amy", 0);
		test.quadraticProbing("Anna", 1);
		test.quadraticProbing("Jenna", 19);
		test.quadraticProbing("Meagan", 200);
		test.quadraticProbing("Sabs", 201);
		test.quadraticProbing("Madi", 219);
		test.quadraticProbing("Pratyusha", 220);
		test.quadraticProbing("James", 820);
		test.quadraticProbing("Jason", 821);
		test.quadraticProbing("Dan", 839);
		test.print(intArray, stringArray);
		System.out.println();
		test.doubleHashing("Amy", 0);
		test.doubleHashing("Anna", 1);
		test.doubleHashing("Jenna", 19);
		test.doubleHashing("Meagan", 200);
		test.doubleHashing("Sabs", 201);
		test.doubleHashing("Madi", 219);
		test.doubleHashing("Pratyusha", 220);
		test.doubleHashing("James", 820);
		test.doubleHashing("Jason", 821);
		test.doubleHashing("Dan", 839);
		test.print(intArray2, stringArray2);
	}
}
