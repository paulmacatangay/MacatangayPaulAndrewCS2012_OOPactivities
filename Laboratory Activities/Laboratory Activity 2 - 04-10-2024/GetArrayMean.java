import java.util.Scanner;

 class GetArrayMean {
    public static double getArrayMean(int[] arr)
    {
        if (arr.length == 0) return 0;
        
        double sum = 0;
        for (int num : arr) sum += num;
        return sum / arr.length;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] integers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            integers[i] = scanner.nextInt();
        }
        
        System.out.printf("Mean of array is: %.2f%n", getArrayMean(integers));
        scanner.close();
    }
}