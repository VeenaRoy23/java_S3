class DoubleEquals{
    public static void main(String args[]){
        String s1="abcdef";
        String s2=new String(s1);
        String s3=s2;
        System.out.println("s1 s2"+(s1==s2));
        System.out.println("s1 s3"+(s1==s3));
        System.out.println("s2 s3"+(s2==s3));
        System.out.println(s1.equals(s2));
         System.out.println(s2.equals(s3));
         System.out.println(s3.equals(s1));

    }
}