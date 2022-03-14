class Animal{

    public static String getdefault(){
        return "hello!";
    }
    public static String getCatGreeting(){
        return "miaoo!";
    }

    public static public static void main(String[] args) {
        public String str=args[0];
        public String output="";
        if(str.equalsIgnoreCase("cat")) output=getCatGreeting();

        output =getdefault();

        System.out.println(output);
    }
    
}