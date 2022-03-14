class Animal{

    public static String getdefault(){
        return "hello!";
    }
    public static String getCatGreeting(){
        return "miaoo!";
    }
    public  static String getBirdGreeting(){
        return "twit!";
    }
    public static public static void main(String[] args) {
        public String str=args[0];
        public String output="";
        if(str.equalsIgnoreCase("cat")) output=getCatGreeting();
        else if(str.equalsIgnoreCase("BIRD")) output = getBirdGreeting();

        output =getdefault();

        System.out.println(output);
    }
    
}