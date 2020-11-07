package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        // homework
        return binarySearch(data, target, 0, data.length - 1);
    }

    public static int binarySearch(int [] data, int target, int low, int high){
        if (high >= low && low < data.length) {
            int mid = low + (high - low) / 2;


        if (data[mid] == target)
            return mid;


        if (data[mid] > target)
            return binarySearch(data, target, low, mid - 1);


        return binarySearch(data, target,mid + 1, high);
    }


        return -1;
}



    }

