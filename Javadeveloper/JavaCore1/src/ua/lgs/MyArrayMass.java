
package ua.lgs;

public class MyArrayMass {
	public static void main(String[] args) {
		int arrayMass[] = new int[10];
		for (int i = 0; i < arrayMass.length; i++) {
			arrayMass[i] = i;
		}
		for (int i = 0; i < arrayMass.length; i++) {
			System.out.println(arrayMass[i]);
		}

		int max = arrayMass[0];
		for (int i = 0; i < arrayMass.length; i++) {
			if (arrayMass[i] > max) {
				max = arrayMass[i];
			}

		}
		System.out.println("Maximum = " + max);

		int min = arrayMass[0];
		for (int i = 0; i < arrayMass.length; i++) {
			if (arrayMass[i] < min) {
				min = arrayMass[i];
			}

		}
		System.out.println("Minimum = " + min);

	}

}
