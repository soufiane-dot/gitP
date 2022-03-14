class Animal {

    public static String getdefault(){
        return "hello!";
        }
        public  static String getBirdGreeting(){
        return "twit!";
        }
    public static void main(String[]args){
        String str=args[0];
        String output="";
        if(str.equalsIgnoreCase("BIRD")) output = getBirdGreeting();
        else output = getdefault();

        System.out.println(output);
        }
}