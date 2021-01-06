package 第九章星号练习;

import java.util.Random;

public class get_number_0_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generato = new Random(1000); //种子1000
		System.out.print("From generato: ");
		
		int n = 0;
		
		for(int i=0; i < 50 ; i++) { //前50个随机数
			System.out.print(generato.nextInt(100)+" ");
			n ++;
		}
		
		
	}

}
