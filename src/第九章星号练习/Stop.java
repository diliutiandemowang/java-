package �ھ����Ǻ���ϰ;

public class Stop {
	    public static void main(String[] args){
	        StopWatch w=new StopWatch();
	        w.start();
	        for(int i=0;i<9999999;i++){
	            for(int j=0;j<9999999;j++){
	            }
	        }
	        w.stop();
	        System.out.println(w.getElapsedTime());
	    }
	}
	class StopWatch{
	    //˽����startTime��endTime
	    private long startTime;
	    private long endTime;
	    public StopWatch(){
	        this.startTime=System.currentTimeMillis();
	    }
	    //start()��stop()����
	    public void start(){
	        this.startTime=System.currentTimeMillis();
	    }
	    public void stop(){
	        this.endTime=System.currentTimeMillis();
	    }
	    public long getElapsedTime(){
	        return endTime-startTime;
	    }
	    //��������������
	    public long getstartTime(){
	        return startTime;
	    }
	    public long getendTime(){
	        return endTime;
	    }
}
