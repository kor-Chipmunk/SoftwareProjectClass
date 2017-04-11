public class ExecTime {
 
    public static void DoWork() {
        // 작업 함수
        for (long i = 0, sum = 0; i < 1000000; i++, sum += i) {
            
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	final long SYSTEM_RESOLUTION = 393;
    	long startTime, endTime;
    	
        startTime = System.nanoTime();        					// 시작시간
        // 빈 작업
        while ((endTime = System.nanoTime()) == startTime);		// 끝시간
        
        long time = endTime - startTime - SYSTEM_RESOLUTION;	// 시간 계산
        System.out.println("Execition Time = " + time + " ns");
    }
    
}