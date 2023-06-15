public class mean{
    public static void main(String[] args) {
        int marks[]={12, 17, 18, 3, 5};
        int sum=0, sumSq=0;
        double mean, stdDev;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
            sumSq=sumSq+marks[i] * marks[i];
        }
        mean = (double)sum/marks.length;
        stdDev=Math.sqrt((double)sumSq/marks.length-mean*mean);
        System.out.println("The mean is: "+ mean);
        System.out.println("Standard deviation is:"+ stdDev);
    }
}