class str{
    public static void main(String args[]){
        String s="Java";
        System.out.println("Concat : "+s.concat("Welcome"));
        System.out.println("Character at index 1 : "+s.charAt(1));
        System.out.println("Index of a : "+s.indexOf('a'));
        System.out.println(" Index of a after first postion: "+s.indexOf('a',2));
        System.out.println("Comparing : "+s.equals("JAVA"));
        System.out.println("Comparing using ignore case : "+s.equalsIgnoreCase("JAVA"));
        System.out.println("Last index : "+s.lastIndexOf('a'));
    }
}