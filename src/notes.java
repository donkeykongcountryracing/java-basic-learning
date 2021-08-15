public class notes {
    public static void main(String[]args){
//        String x= "123";
//        int y = 123;
////ask why it is FALSE
//        System.out.print(x==String.valueOf(y));
//        System.out.print(x.equals(y));
//
////        //ask bobby about buttons
//
//        String[] food=("hello","helo");
//        String[]= new String[10];
//        String groceris=("helo", "what");
////        int[] fod=new int[1,2 ,3]
////        int[] what=(1,2,3);
////        int[] multipleOfThree = new int[33];
//
//// ask bobby difference between java and javascript
////        int i= 3; ask bobby if this is real and what the difference between this and normal while is
////        do {
////        i++;
////        }while(i=6)
        int[][] hello = {{1,3},{4,2}};
        System.out.println(hello[1][1] + hello[1][0]);// can add the arrays together
        String[][] bye ={{"bye"},{"hello"}};
        System.out.println(bye[1][0] + bye[0][0]);
        Object[] array ={1,"hello"};//object is a superior class type and a object array can hold different types
//        System.out.println(array[0]+ array[1]); + sign cannot be applied to objects
        System.out.println(array[1]);
        System.out.println(array[0]);//can't add the object arrays together in one line
        int x =4;
        String he ="he";
        String me= he+x;//you can add a int and string and make them equal string because it will automtically do
//        .toString(). It is the same for objects



    }
}
