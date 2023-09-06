class methodoverloading{
    static int calc(int x, int y){
        return x+y;
    }

     static double calc(double x, double y){
        return x-y;
    }

   public static void main(String[] args) {
         int num1 = calc(10,20);
         double num2 = calc(10,20);
         System.out.println("add:"+num1);
         System.out.println("sub:"+num2);

   }
}
