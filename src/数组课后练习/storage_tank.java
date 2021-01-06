package Êý×é¿ÎºóÁ·Ï°;

public class storage_tank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] box = new boolean[101];

		for(int i = 1 ;i < 100 ; ++i) {
			if(i == 1) {
				for(int j = 1 ; j <= 100 ; ++j) {
					box[j] = !box[j];
				}
			}
			else if(i == 2) {
				for(int j = i ; j <= 100 ; j += 2) {
					box[j] = !box[j];
				}
			}
			else {
				for(int j = i ; j <= 100 ; j += i) {
					box[j] = !box[j];
				}			
			}
		}
		
		for(int i = 1 ;i < 100 ; ++i) {
			if(box[i]) {
				System.out.print(i);
			}
		}
	}

}
