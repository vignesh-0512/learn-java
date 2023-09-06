class scope {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);

        {
            //accessed only inside the block
            float f = 30.00f;
            System.out.println(f);
        }
    }
}
