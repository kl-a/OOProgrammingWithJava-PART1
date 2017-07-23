import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;        
        for (int num : list) {
            sum += num; 
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list)/(double)(list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double variance = 0; 
        double av = average(list);
        for (int num : list) { 
            variance += Math.pow((num - av), 2);   
        }
        variance /= (list.size()-1); 
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
