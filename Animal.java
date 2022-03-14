class Animal {

    public static String getdefault(){
        return "hello!";
        }
    public static void main(String[]args){
        String str=args[0];
        String output="";
        if(str.equalsIgnoreCase("cat")) output = str;
        else output = getdefault();

        System.out.println(output);
        }
}