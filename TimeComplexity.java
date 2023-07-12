public class TimeComplexity {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexity demo = new TimeComplexity();
        System.out.println(demo.finsum(99999));

        double newOne = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (newOne - now) + " millisecs");   
    }

    public int finsum(int n) {
        return n* (n+1)/2;
    }
  
}