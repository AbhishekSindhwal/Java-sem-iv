class shape{
    float area(int r){
        float ans=3.14f*r*r;
        return ans;
    }
    int area(int l, int b){
        int ans=l*b;
        return ans;
    }
    float area(float h,float b){
        float ans=.5f*b*h;
        return ans;
    }
    public static void main(String args[]){
        shape s=new shape();
        System.out.println("Area of circle : "+s.area(5));
        System.out.println("Area of reactangle : "+s.area(5,4));
        System.out.println("Area of triangle : "+s.area(5.1f,4.2f));
    }
}