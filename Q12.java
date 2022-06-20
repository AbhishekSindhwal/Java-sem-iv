class bank{
    float getRateOfInterest(){
        return 3f;
    }
}
class HDFC extends bank{
    float getRateOfInterest(){
        return 4.0f;
    }
}
class SBI extends bank{
    float getRateOfInterest(){
        return 4.5f;
    }
}
class PNB extends bank{
    float getRateOfInterest(){
        return 5.0f;
    }
}
class program{
    public static void main(String args[]){
        bank b;
        b=new HDFC();
        System.out.println("Rate of intrest in HDFC : "+b.getRateOfInterest());
        b=new SBI();
        System.out.println("Rate of intrest in SBI : "+b.getRateOfInterest());
        b=new PNB();
        System.out.println("Rate of intrest in PNB : "+b.getRateOfInterest());
    }
}