class arrays {
    public static void main(String[] args) {
    String[] cars = {"abc","def"};
    for(String i : cars){
        System.out.println(i);
    }

    int[] num = {10,20,30};
    System.out.println(num);
    
    //accessing
    System.out.println(cars[0]);

    //changing values
    cars[0] = "ghi";
    System.out.println(cars);

    System.out.println(cars.length);
}
}



