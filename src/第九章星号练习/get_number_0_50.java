package �ھ����Ǻ���ϰ;

import java.util.Random;

public class get_number_0_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generato = new Random(1000); //����1000
		System.out.print("From generato: ");
		
		int n = 0;
		
		for(int i=0; i < 50 ; i++) { //ǰ50�������
			System.out.print(generato.nextInt(100)+" ");
			n ++;
		}
		
		
	}

}
