import java.util.Objects;

public class Triangle {
    private int a;
    private int b;
    private int c;
    String type;

    public Triangle() {
          createTrangle();
            type = "Triangle";

    }


    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Triangle tr = (Triangle)obj;
            return         this.a ==tr.a && this.c==tr.c && this.b == tr.b;


    }

    private void createTrangle()  {
        double x1 = Math.random() * 4 + 6;
        double x2 =  Math.random() * 4+ 4;
        double x3 =  Math.random() * 4+1 ;
        double y1 =  Math.random() * 4+2;
        double y2 =  Math.random() * 4+1;
        double y3 =  Math.random() * 4+1;
        try {
            canculate(x1, x2, x3, y1, y2, y3);
        }
        catch (WrongDataExeption exeption){
            a = 3;
            b =4;
            c= 5;
            type = "Triangle";
        }



        System.out.println("KOORD"+x1+x2+x3+y1+ y2+ y3);
    }

    private void canculate(double x1, double x2, double x3, double y1, double y2, double y3)throws WrongDataExeption  {
        a = (int) Math.floor(Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1)));
        b = (int) Math.floor(Math.sqrt(Math.pow(2, x3 - x2) + Math.pow(2, y3 - y2)));
        c = (int)Math.floor( Math.sqrt(Math.pow(2, x3 - x1) + Math.pow(2, y3 - y1)));
        if(a < b + c || b < a + c || c < a + b){}
        else{
        throw new WrongDataExeption();}

    }
     private  int longgestSide(){
        if(a >b && a >c){
            return 1;
    }
        if(b >a && b>c){
            return 2;
        }
        if (a == b &&b== c && c == a){
            return 4;
        }
        return 3;
    }
public  String toString(){
  return "Type" + " " + type + " "+"Sides"+" "+ a+" "+b+" "+c;
}
    public void typeOfTriangle() {
        int flag = longgestSide();


            switch (flag){
                case 1:
                    if(Math.pow(2,a)>(Math.pow(2,b)+Math.pow(2, c))){
                        type ="TypoYgol";
                    }
                    if(Math.pow(2,a)<(Math.pow(2,b)+Math.pow(2, c))){
                        type ="OstroYgol";
                    }
                    if(Math.pow(2,a)==(Math.pow(2,b)+Math.pow(2, c))){
                        type ="90";
                    }
                    break;
                case 2:
                    if(Math.pow(2,b)>(Math.pow(2,a)+Math.pow(2, c))){
                        type ="TypoYgol";
                    }
                    if(Math.pow(2,b)<(Math.pow(2,a)+Math.pow(2, c))){
                        type ="OstroYgol";
                    }
                    if(Math.pow(2,b)==(Math.pow(2,a)+Math.pow(2, c))){
                        type ="90";
                    }
                    break;
                case 3:
                    if(Math.pow(2,c)>(Math.pow(2,b)+Math.pow(2, c))){
                        type ="TypoYgol";
                    }
                    if(Math.pow(2,c)<(Math.pow(2,b)+Math.pow(2, c))){
                        type ="OstroYgol";
                    }
                    if(Math.pow(2,c)==(Math.pow(2,b)+Math.pow(2, c))){
                        type ="90";
                    }
                    break;
                case 4:
                    type = "Rivno";
                    break;

            }






    }

}
