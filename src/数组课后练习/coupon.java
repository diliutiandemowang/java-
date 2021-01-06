package 数组课后练习;

public class coupon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        boolean[] huase = new boolean[4];   //存放每种花色
        boolean flag = false;
        int count = 0;

        while(flag == false){       
            if(huase[0]&&huase[1]&&huase[2]&&huase[3])  //若四种花色 
                flag = true;
            else{
                switch(choosePai(huase)){
                    case "Spades":
                        huase[0] = true;
                        break;
                    case "Hearts":
                        huase[1] = true;
                        break;
                    case "Diammonds":
                        huase[2] = true;
                        break;
                    case "Clubs":
                        huase[3] = true;
                        break;
                }
            }
            count++;
        }
        System.out.println("Number of picks:"+count); 
    }
    
    public static String choosePai(boolean[] huase){
        int[] deck = new int[52];   //用来存放52张牌 
        String[] Huases = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        
        //初始化牌组
        for(int i = 0;i < deck.length;i++){
            deck[i] = i;
        } 
        
        //洗牌
        for(int i = 0;i < deck.length;i++){
            int Index = (int)(Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[Index];
            deck[Index] = temp;
        }
        
        //进行抽牌
        int i = (int)(Math.random()*deck.length);
        String Huase = Huases[deck[i] / 13];
        String rank = ranks[deck[i]%13];
        switch(Huase){
        case "Spades":  
            if(!huase[0])  
                {System.out.println(rank+" of "+Huase);huase[0] = true;}  
            break;  
        case "Hearts":  
            if(!huase[1])  
                {System.out.println(rank+" of "+Huase);huase[1] = true;}  
            break;  
        case "Diamonds":  
            if(!huase[2])  
                {System.out.println(rank+" of "+Huase);huase[2] = true;}  
            break;  
        case "Clubs":  
            if(!huase[3])  
                {System.out.println(rank+" of "+Huase);huase[3] = true;}  
            break;  
        } 
        return Huase;
    }

}
