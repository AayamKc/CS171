package cs171;

public class PracticeAugust29 {
    public static int inOrder(Integer[] arr){
        int count = 0;
        for(int i = 0; i < arr.length-1; i ++){
            if (arr[i] < arr[i+1]) {
                count++;
            }
            }
        return count;
        }

    public static void main(String[] args) {
        Integer[] list = {3,7,8,5,4,9};
        int answer = inOrder(list);
        System.out.println(answer);
    }
}
