class functioncalc{
    static int add(int x, int y){
        return x+y;
    }

     static int sub(int x, int y){
        return x-y;
    }

    static int mul(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        int num = add(3,4);
        System.out.println("add:"+num);
        int num1 = sub(3,4);
        System.out.println("sub:"+num1);
        int num2 = mul(3,4);
        System.out.println("mul:"+num2);
    }

}