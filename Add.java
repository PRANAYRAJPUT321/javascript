class Add{
    int a;
    int b;
    int result;

    void Add(int a , int b){
        result=a+b;
    }

    void Displayresult(){
        System.out.println("Addition of two numbers is :"+result);
    }

    public static void main(String[] args) {
        Add a1=new Add();
        Add a2=new Add();

        a1.Add(25,45);
        a2.Add(5,45);

        a1.Displayresult();
         a2.Displayresult();
    }
}