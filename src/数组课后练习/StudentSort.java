package ����κ���ϰ;


import java.util.*;

public class StudentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of students :");
		number = input.nextInt();
		
		String name[] = new String[number];
		double score[] = new double[number];
		
		for(int i = 0 ; i < number ; i++) {  //���������ɼ�
			System.out.print("Enter name and score: ");
			name[i] = input.next();
			score[i] = input.nextDouble();
		}
		
		String temp;
		double min;
		
		for(int i = 0 ; i<number ; i++) {  //����Ѱ����Сֵ
			min = score[i];
			int minI = i ;
			for(int j = i + 1; j < number ; j++) {
				if(min > score[j]) {
					min = score[j];
					minI = j;
				}
			}
		if(minI != i) {  //�ƶ���Сֵ
			score[minI] = score[i];score[i] = min;
			temp = name[minI];name[minI] = name[i];name[i] = temp;
		    }			
		}
		
		for(int i = number-1 ; i >= 0 ; i--) {  //������
			System.out.println(name[i] + " " + score[i]);
		}
		
	}

}
