import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int array[] = readElements(readInteger());
        System.out.println("The minimum array value is: " + findMin(array));


    }

    private static int[] readElements(int size){
        System.out.println("Write " + size + " elements");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        int counter=1;
        for(int i=0 ;i<array.length; i++){
            System.out.println("Element " + counter + " : ");
            array[i] = scanner.nextInt();
            counter++;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
//        for(int i =0; i<array.length; i++){
//            if(array[i] <= min) min = array[i];
//        }
        for(int el: array){
            if(el<min) min = el;
        }

        return min;
    }

    private static int readInteger(){
        System.out.println("How many elements do u want to write? ");
        Scanner scanner = new Scanner(System.in);
        int elements = scanner.nextInt();
        return elements;

    }
}