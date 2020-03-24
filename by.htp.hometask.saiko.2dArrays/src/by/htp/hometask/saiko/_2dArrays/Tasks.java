package by.htp.hometask.saiko._2dArrays;

import java.util.Random;
import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {

		task01();
		task02();
		task03();
		task04();
		task05();
		task06();
		task07();
		task08();
		task09();
		task10();
		task11();
		task12();
		task13();
		task14();
		task15();
		task16();
		task17();
		task18();
		task19();
		task20();
		task21();
		task22();
		task23();
		task24();
		task25();
		task26();
		task27();
		task28();
		task29();
		task30();
		task31();
		task32();
		task33();
		task34();
		task35();
		task36();
		task37();
		task38();
		task39();
		task40();
	}

	
	public static void task01() {

		// Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке
		// была ровно одна единица, и вывести на экран.

		int[][] mas = new int[3][4];

		for (int i = 0; i < mas.length; i++) {
			mas[i][1] = 1;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task02() {

		// Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из
		// [0, 9].

		int[][] mas = new int[2][3];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9 + 1);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task03() {

		// Дана матрица. Вывести на экран первый и последний столбцы.

		int[][] mas = new int[3][3];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%-2d]", mas[i][0]);
			System.out.printf("[%-2d]", mas[i][mas[i].length - 1]);
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task04() {

		// Дана матрица. Вывести на экран первую и последнюю строки.

		int[][] mas = new int[4][4];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
			}
		}

		for (int j = 0; j < mas[mas.length - 1].length; j++) {
			System.out.printf("[%-2d]", mas[0][j]);
		}
		System.out.println();

		for (int j = 0; j < mas[mas.length - 1].length; j++) {
			System.out.printf("[%-2d]", mas[mas.length - 1][j]);
		}
		System.out.println();
		System.out.println();
	}

	
	public static void task05() {

		// Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.

		int[][] mas = new int[4][4];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}

		for (int i = 1; i < mas.length; i += 2) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task06() {

		// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
		// больше последнего

		int[][] mas = new int[3][6];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j += 2) {
				if (mas[0][j] > mas[mas.length - 1][j]) {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task07() {

		// Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных
		// элементов

		int[][] mas = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100) - 50;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}

		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0 && mas[i][j] % 2 != 0) {
					sum = sum + Math.abs(mas[i][j]);
				}
			}
		}
		System.out.println("Сумма модулей отрицательных нечетных элементов: " + sum);
		System.out.println();
	}

	
	public static void task08() {

		// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		// число 7 среди элементов массива.

		int n = 2;
		int m = 5;
		int[][] mas = new int[n][m];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
					count++;
				}
			}
		}
		System.out.println("Число 7 встречается " + count + " раз");
		System.out.println();
	}

	
	public static void task09() {

		// Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

		int[][] mas = new int[3][3];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("Числа, стоящие по диагонали: ");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.print(mas[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println();
	}

	
	public static void task10() {

		// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int k = 1;
		int p = 2;

		int[][] mas = new int[4][4];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("Числа, стоящие в k-й строке: ");
		for (int j = 0; j < mas[mas.length - 1].length; j++) {
			System.out.print(mas[k][j] + " ");
		}
		System.out.println();

		System.out.println("Числа, стоящие в p-м столбце: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i][p] + " ");
		}
		System.out.println();
		System.out.println();
	}

	
	public static void task11() {

		// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая
		// строка справа налево, вторая строка слева направо, третья строка справа
		// налево и так далее.

		int[][] mas = { { 3, 4, 5 }, { 6, 7, 8 }, { 1, 2, 3 }, { 6, 2, 9 } };

		for (int i = 0; i < mas.length; i++) {

			if (i % 2 == 0) {
				for (int j = mas[i].length - 1; j >= 0; j--) {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			} else if (i % 2 != 0) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task12() {

		// Получить квадратную матрицу порядка n:

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = j;
				} else {
					mas[i][j] = 0;
				}
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task13() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			if ((i % 2) == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					mas[i][j] = j + 1;
					System.out.printf("[%-2d]", mas[i][j]);
				}
				System.out.println();
			} else {
				for (int j = mas[i].length - 1; j >= 0; j--) {
					mas[i][j] = j + 1;
					System.out.printf("[%-2d]", mas[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println();
	}

	
	public static void task14() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = mas[i].length - 1; j >= 0; j--) {
				if (i == j) {
					mas[i][j] = i + 1;
				} else {
					mas[i][j] = 0;
				}
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task15() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = mas[i].length - j;
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task16() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = (i + 1) * (i + 2);
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task17() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((i == 0) || (j == 0) || (i == mas[i].length - 1) || (j == mas[i].length - 1)) {
					mas[i][j] = 1;
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task18() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = mas[i].length - 1; j >= 0; j--) {
				if (i > j) {
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					mas[i][j] = i + 1;
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task19() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if ((j >= i) && (j < mas[i].length - i)) {
					mas[i][j] = 1;
					System.out.printf("[%-2d]", mas[i][j]);
				} else if ((j <= i) && (j >= ((mas[i].length - i) - 1))) {
					mas[i][j] = 1;
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task20() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				if ((j > i) && (j < (mas[i].length - i) - 1) || (j < i) && (j >= (mas[i].length - i))) {
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					mas[i][j] = 1;
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task21() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (i >= j) {
					mas[i][j] = mas.length - i + j;
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task22() {

		// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {
				if (j < mas[i].length - i) {
					mas[i][j] = j + i + 1;
					System.out.printf("[%-2d]", mas[i][j]);
				} else {
					System.out.printf("[%-2d]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task23() {

		// Сформировать квадратную матрицу порядка N по правилу:

		int n = 6;
		double[][] mas = new double[n][n];
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				if (mas[i][j] > 0) {
					count++;
				}
				System.out.printf("[%-10f]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("Положительных элементов в матрице = " + count);
		System.out.println();
	}

	
	public static void task24() {

		// Дан линейный массив x1, x2,..., xn-1, xn. Получить действительную квадратную
		// матрицу порядка n:

		int n = 6;
		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i] = (int) Math.pow(j + 1, i + 1);
				System.out.printf("[%-8d]", mas[i]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task25() {

		// Получить квадратную матрицу порядка n:

		int n = 6;
		int[][] mas = new int[n][n];
		int x = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = x + 1;
				x++;
				System.out.printf("[%-8d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task26() {

		// С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с
		// массивом следующие действия:
		// а) вычислить сумму отрицательных элементов в каждой строке;
		// б) определить максимальный элемент в каждой строке;
		// в) переставить местами максимальный и минимальный элементы матрицы

		int n = 4;
		int m = 4;
		
		Random rand = new Random();
		int mas[][] = new int[n][m];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100) - 50;
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}

		int sum_negative = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum_negative += mas[i][j];
				}
			}
		}
		System.out.println("а) Сумма отрицательных цисел равна: " + sum_negative);

		System.out.println("б) Определяем максимальный элемент в каждой строке: ");
		for (int i = 0; i < mas.length; i++) {
			int max = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
			System.out.println("Максимальный элемент в " + i + " строке равен: " + max);
		}

		int max = 0;
		int min = mas[0][0];
		int i_max = 0;
		int j_max = 0;
		int i_min = 0;
		int j_min = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
					i_max = i;
					j_max = j;
				}
				if (mas[i][j] < min) {
					min = mas[i][j];
					i_min = i;
					j_min = j;
				}
			}
		}

		System.out.println("в) Переставляем местами максимальный и минимальный элементы матрицы: ");

		mas[i_min][j_min] = max;
		mas[i_max][j_max] = min;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task27() {

		// В числовой матрице поменять местами два столбца любых столбца, т. е. все
		// элементы одного столбца поставить на соответствующие им позиции другого, а
		// его элементы второго переместить в первый. Номера столбцов вводит
		// пользователь с клавиатуры.

		int m = 5;
		int n = 5;
		
		Random rand = new Random();
		int[][] mas = new int[m][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100) - 50;
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Какие два столбца нужно поменять местами?");
		Scanner in = new Scanner(System.in);
		int firstColumn = in.nextInt();
		int secondColumn = in.nextInt();
		in.close();

		if (firstColumn >= mas[0].length || secondColumn >= mas[0].length) {
			System.out.println("Такого столбца не существует.");
		} else {
			for (int i = 0; i < mas.length; i++) {
				int temp = mas[i][firstColumn];
				mas[i][firstColumn] = mas[i][secondColumn];
				mas[i][secondColumn] = temp;
			}
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.printf("[%-3d]", mas[i][j]);
				}
				System.out.println();
			}
		}
		System.out.println();
	}

	
	public static void task28() {

		// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
		// столбце. Определить, какой столбец содержит максимальную сумму.

		int mas[][] = new int[5][5];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50) - 30;
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}
		int max = 0;

		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				sum += mas[j][i];
			}
			System.out.println("Сумма " + i + " столбца равна: " + sum);
			
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println("Максимальная сумма равна: " + max);
		System.out.println();
	}

	
	public static void task29() {

		// Найти положительные элементы главной диагонали квадратной матрицы

		int mas[][] = new int[5][5];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50) - 25;
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("Положительные элементы главной диагонали: ");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i][i] > 0) {
				System.out.print(mas[i][i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	
	public static void task30() {

		// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
		// матрицу и номера строк, в которых число 5 встречается три и более раз.

		int count = 0;
		
		Random rand = new Random();
		int mas[][] = new int[10][20];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(16);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println("Номера строк, в которых число 5 встречается три и более раза: ");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					count++;
				}
			}
			if (count > 2) {
				System.out.print(i + " ");
			}
			count = 0;
		}
		System.out.println();
		System.out.println();
	}

	
	public static void task31() {

		// Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
		// количество двузначных чисел в ней.

		int n = 0;
		int count = 0;
		int mas[][] = new int[50][20];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = n++;
				if (mas[i][j] > 9 && mas[i][j] < 100) {
					count++;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println("Количество двузначных чисел равно: " + count);
		System.out.println();
	}

	
	public static void task32() {

		// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

		Random rand = new Random();
		int[][] mas = new int[4][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		int temp;
		for (int count = 0; count < mas.length - 1; count++) {
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length - 1; j++) {
					if (mas[i][j] > mas[i][j + 1]) {
						temp = mas[i][j];
						mas[i][j] = mas[i][j + 1];
						mas[i][j + 1] = temp;
					}
				}
			}
		}
		
		System.out.println("Сортировка строк матрицы по возрастанию значений элементов: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		for (int count = 0; count < mas.length - 1; count++) {
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length - 1; j++) {
					if (mas[i][j] < mas[i][j + 1]) {
						temp = mas[i][j];
						mas[i][j] = mas[i][j + 1];
						mas[i][j + 1] = temp;
					}
				}
			}
		}
		
		System.out.println("Сортировка строк матрицы по убыванию значений элементов: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void task33() {

		// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

		Random rand = new Random();
		int[][] mas = new int[4][4];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(30);
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		int temp;
		for (int count = 0; count < mas.length - 1; count++) {
			for (int i = 0; i < mas.length - 1; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (mas[i][j] > mas[i + 1][j]) {
						temp = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = temp;
					}
				}
			}
		}
		
		System.out.println("Сортировка столбцов матрицы по возрастанию значений элементов: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}

		for (int count = 0; count < mas.length - 1; count++) {
			for (int i = 0; i < mas.length - 1; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (mas[i][j] < mas[i + 1][j]) {
						temp = mas[i][j];
						mas[i][j] = mas[i + 1][j];
						mas[i + 1][j] = temp;
					}
				}
			}
		}
		
		System.out.println("Сортировка столбцов матрицы по убыванию значений элементов: ");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	public static void task34() {

		// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.

		int m = 6;
		int n = 6;
		int[][] mas = new int[m][n];
		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			int count = 0;
			for (int j = 0; j < mas[i].length; j++) {
				mas[j][i] = rand.nextInt(2);
				if (mas[j][i] == 1) {
					count++;
				}
			}
			if (count != i) {
				i--;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-1d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void task35() {
		
		// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
		
		Random rand = new Random();
		int[][] mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50) - 25;
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}

		int max = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length - 1; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}
		
		System.out.println("Максимальный элемент: " + max);
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 != 0) {
					mas[i][j] = max;
				}
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-3d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void task36() {
		
		// Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат сглаживания заданной матрицы

		Random rand = new Random();
		int[][] mas = new int[5][5];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
				System.out.printf("[%-9d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		float[][] masNew = new float[mas.length][mas[0].length];

		for (int i = 0; i < masNew.length; i++) {
			for (int j = 0; j < masNew[i].length; j++) {

				if ((j == 0) && (i == 0)) {
					masNew[i][j] = (float) (mas[i + 1][j] + mas[i][j + 1]) / 2;
				} else if (j == masNew[i].length - 1 && i == 0) {
					masNew[i][j] = (float) (mas[i][j - 1] + mas[i + 1][j]) / 2;
				} else if (j == masNew[i].length - 1 && i == masNew.length - 1) {
					masNew[i][j] = (float) (mas[i][j - 1] + mas[i - 1][j]) / 2;
				} else if ((j == 0) && i == masNew.length - 1) {
					masNew[i][j] = (float) (mas[i][j + 1] + mas[i - 1][j]) / 2;
				} else if (j == 0) {
					masNew[i][j] = (float) (mas[i][j + 1] + mas[i + 1][j] + mas[i - 1][j]) / 3;
				} else if (j == masNew[i].length - 1) {
					masNew[i][j] = (float) (mas[i][j - 1] + mas[i + 1][j] + mas[i - 1][j]) / 3;
				} else if (i == 0) {
					masNew[i][j] = (float) (mas[i + 1][j] + mas[i][j + 1] + mas[i][j - 1]) / 3;
				} else if (i == masNew.length - 1) {
					masNew[i][j] = (float) (mas[i - 1][j] + mas[i][j + 1] + mas[i][j - 1]) / 3;
				} else {
					masNew[i][j] = (float) (mas[i][j - 1] + mas[i][j + 1] + mas[i - 1][j] + mas[i + 1][j]) / 4;
				}
			}
		}

		for (int i = 0; i < masNew.length; i++) {
			for (int j = 0; j < masNew[i].length; j++) {
				System.out.printf("[%-9f]", masNew[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void task37() {
		
		// Переставить строки матрицы случайным образом
		
		Random rand = new Random();
		int mas[][] = new int[5][5];
		int k;
		int n;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		do {
			k = (int) (Math.random() * (mas.length));
			n = (int) (Math.random() * (mas.length));
		} while (k == n);
		
		int masNew[] = new int[mas.length];

		for (int i = 0; i < masNew.length; i++) {
			masNew[i] = mas[k][i];
		}

		for (int i = 0; i < mas.length; i++) {
			mas[k][i] = mas[n][i];
			mas[n][i] = masNew[i];
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void task38() {
		
		// Найдите сумму двух матриц

		Random rand = new Random();
		int n = 6;
		int[][] mas = new int[n][n];
		int[][] mas2 = new int[n][n];
		int[][] sum = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(20);
				mas2[i][j] = rand.nextInt(20);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.printf("[%-2d]", mas2[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = mas[i][j] + mas2[i][j];
			}
		}

		System.out.println("Сумма матриц равна: ");

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.printf("[%-2d]", sum[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	public static void task39() {
		
		// Найдите произведение двух матриц.
		
		Random rand = new Random();
		int n = 6;
		int[][] mas = new int[n][n];
		int[][] mas2 = new int[n][n];
		int[][] mult = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);	
				mas2[i][j] = rand.nextInt(10);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.printf("[%-2d]", mas2[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mult.length; i++) {
			for (int j = 0; j < mult[i].length; j++) {
				mult[i][j] = mas[i][j] * mas2[i][j];
			}
		}

		System.out.println("Произведение матриц равно: ");

		for (int i = 0; i < mult.length; i++) {
			for (int j = 0; j < mult[i].length; j++) {
				System.out.printf("[%-2d]", mult[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
		
	public static void task40() {
		
		// Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., n2, так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат. 
		
		int n = 5;
		int[][] mas = new int[n][n];

		int num = 1;
		int k = n * 3 / 2;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mas[(j - i + k) % n][(i * 2 - j + n) % n] = num++;
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%-2d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
