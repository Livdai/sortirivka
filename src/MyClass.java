public class MyClass {
    public static void main(String args[]) {

        int[] array = {20,61,1,8,13,3,85,100} ;
        int temp = array[0];

        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }


        for(int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");
        }

    }
}
