public class ArrayParam {
    public static void main(String[] args) {
        int[]array={1,2,3,40};
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.println("printArray收到的参数是");
        System.out.println(array);
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
