class question3{
    public static void main(String[] args){

        int num = Integer.parseInt(args[0]);
        float num2 = Float.parseFloat(args[1]);
        double num3 = Double.parseDouble(args[2]);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);
        double result = num + num2 + num3;
        System.out.println(result);//37.99999997771111816






       /*int num = 12;
       String st = num;
       System.out.println(num);//int cannot be converted to string
       */

        /*int num = 12;
        String st = Integer.toString(num);
        System.out.println(st);// 12// Boxing //primtive datatype converted to non-primitive datatype
        */

        /*String st= "1234";
        int num = Integer.parseInt(st);
        System.out.println(num);//Unboxing//non-primitive datatype converted to primitive datatype
        */








    }
    
}