package ua.sergey.kostyniuk;

import java.util.Arrays;

public class Complementary {
	static void complementary_sequences (int[] array, int complementary) {
	    Arrays.sort(array);
        int i, j;
        i = 0;
        j = array.length - 1;
        while (i < j) {
            int K = array[i] + array[j];
            if (K == complementary) {
                // ��� ���: System.out.println("K = " + array[i] + " + " + array[j]);
                System.out.println("K " + K + " = " +array[i] + " + " + array[j]);
                i++;
                j--;
            } else {
                if (K < complementary) i++;
                else j--;
            }
        }
	}

	public static void main(String[] args) {
		int[] A = {0, 1, 3, 4, 5, 6, 7, 8, 9, 11, 45 ,33, 23, 34 ,56 , 28, 78, 33}; //������� �����
		int a , b;   // ��� ���� ������
		a = 7;
		b = 39;
 	    complementary_sequences(A, a); 
 	    complementary_sequences(A, b);

	}

}
