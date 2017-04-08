public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };
//        FindInArray findInArray = new FindInArray();
//        System.out.println(findInArray.Find2(7,arr));

        String str = "We are happy";
        StringBuffer stringBuffer = new StringBuffer(str);
        Problem2 problem2 = new Problem2();
        System.out.println(problem2.replaceSpace(stringBuffer));



    }
}
