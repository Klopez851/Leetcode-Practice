package ModifiedBinarySearch;

public class BinarySearch {

    public static int iterativeBinarySearch(int[] array, int target){
        int low = 0;
        int high = array.length-1;

        while(low<= high){
            int middle = Math.floorDiv((low+high),2);

            if(array[middle] == target){
                return middle;
            }

            if(array[middle]< target){
                low = middle+1;
            }

            if(array[middle] > target){
                high = middle-1;
            }
        }

        return -1;
    }


    public static int recursiveBinarySearch(int[] array, int target, int low, int high){
        if(low>high){
            return -1;
        }

        int middle = Math.floorDiv((low+high),2);

        if (array[middle]> target) {
            recursiveBinarySearch(array, target, low, middle-1);
        }

        if(array[middle]< target){
            recursiveBinarySearch(array, target, middle+1, high);
        }

        return middle;
    }


    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        System.out.println(array[recursiveBinarySearch(array, 40, 0, array.length-1)]);
    }
}
