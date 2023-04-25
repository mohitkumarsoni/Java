package a0_git;
//find average number from int array with lambda

interface Lamm{
    int average(int []arr);
}

public class Average {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};

        Lamm obj = (int []a) ->{
            int avg = 0;
            int sum=0;
            for(int i:a){
                sum = sum+i;
            }
            avg = sum/ a.length;
            return avg;
        };

        int result = obj.average(arr);
        System.out.println(result);
    }
}