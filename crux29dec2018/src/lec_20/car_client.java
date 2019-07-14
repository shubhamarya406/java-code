package lec_20;

public class car_client {

	public static void main(String[] args) {
		car[] cars = new car[5];
		cars[0] = new car(10, 200, "Black");
		cars[1] = new car(20, 100, "Green");
		cars[2] = new car(30, 300, "red");
		cars[3] = new car(150, 400, "Blue");
		cars[4] = new car(70, 500, "Grey");
		
		bubblsort(cars);
		display(cars);

	}

	private static <T> void display(T[] cars) {
		for (T val : cars) {
			System.out.println(val);
		}

	}

	public static <T extends Comparable<T>> void bubblsort(T arr[]) {
		//T min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}
