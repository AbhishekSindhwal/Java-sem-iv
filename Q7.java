class str{
    public static void main(String args[]){
        StringBuffer s=new StringBuffer("HELLO");
        s.append("Java");
        System.out.println("Append : "+s);
        s.insert(1,"Java");
        System.out.println("Insert : "+s);
        s.replace(1,2,"Java");
        System.out.println("Replace : "+s);
        s.delete(1,2);
        System.out.println("Delete : "+s);
        s.reverse();
        System.out.println("Reverse : "+s);
    }
}