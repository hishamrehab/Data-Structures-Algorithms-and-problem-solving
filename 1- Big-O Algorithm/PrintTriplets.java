public static void printTriplets(int [] arr) {
    for (int i = 0 ; i < arr.length ; i++) {
   for(int j = i + 1 ; j < arr.length ; j++) {
    for(int k = j + 1 ; k < arr.length ; k++) {
        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
    }
   }
   }
}