package Questions;

public class Method4MaxnMin {
    public static void main(String[] args) {
        max(12, 34, 2, 5);
        min(56, 23, 98, 1);
    }

    static void max(int ...v){
        int max = v[0];
        for (int i = 0; i < v.length; i++){
            if (v[i] > max){
                max = v[i];
            }
        }
        System.out.println(max);
    }

    static void min(int ...v){
        int min = v[0];
        for (int j : v) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
