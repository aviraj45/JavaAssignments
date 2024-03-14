class question1{
    public static void main(String[]args){
        int num = 10;
        double d = num;
        System.out.println(d);//Widening conversion
       // System.out.println("Hello World");
     /* int num = 10;
      double d = num;
      System.out.println(d);//10.0//Widening
      
      */
    /*
     double num = 10.5;
     double d = num;
     System.out.println(d);//10.5 */

    /* double num = 10.25;
     int i = num;
     System.out.println(i);//lossy conversion //Narrowing
     */

    /*int num = 1000;
    String st = num;
    System.out.println(st);//int cannot be converted to string
    */


   /* int num = 1000;
    String st = Integer.toString(num);
    System.out.println(st);//1000 //1000 is printed as String
   */

    /*
    String st = "1224";
    int num = st;//error//String cannot be converted to int
    */

   /* String st = "1224";
    int num = Integer.parseInt(st);
    System.out.println(num);//1224//String converted to int
    */



    }
}