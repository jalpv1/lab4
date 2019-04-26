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
        double hash=1;
        final double r = 17;
        hash =r *hash+a+b+c;
        return (int)hash;
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
        if(tr.a ==tr.b && tr.a==tr.c && tr.c == tr.b){
            return true;
        }
        return false;
    }

    public void createTrangle() {
        /*int x1 =  3;
        int x2 = -2;
        int x3 = -2;
        int y1 = 3;
        int y2 = 3;
        int y3 = 2;*/
        /*int x1 = (int)Math.floor (Math.random() * 4);
        int x2 = (int)Math.floor ( Math.random() * 4);
        int x3 = (int)Math.floor ( Math.random() * 4);
        int y1 = (int)(int)Math.floor ( Math.random() * 4);
        int y2 = (int)(int)Math.floor ( Math.random() * 4);
        int y3 = (int)(int)Math.floor (Math.random() * 4);*/
        double x1 = Math.random() * 4;
        double x2 =  Math.random() * 4;
        double x3 =  Math.random() * 4;
        double y1 =  Math.random() * 4;
        double y2 =  Math.random() * 4;
        double y3 =  Math.random() * 4;
        canculate(x1, x2, x3, y1, y2, y3);
        System.out.println("KOORD"+x1+x2+x3+y1+ y2+ y3);
    }

    public void canculate(double x1, double x2, double x3, double y1, double y2, double y3) {
        a = (int) Math.floor(Math.sqrt(Math.pow(2, x2 - x1) + Math.pow(2, y2 - y1)));
        b = (int) Math.floor(Math.sqrt(Math.pow(2, x3 - x2) + Math.pow(2, y3 - y2)));
        c = (int)Math.floor( Math.sqrt(Math.pow(2, x3 - x1) + Math.pow(2, y3 - y1)));

    }
    int longgestSide(){
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

        if (a < b + c || b < a + c || c < a + b) {
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
        else{type = "One line";}
        /*if(a = c+b || c = a + b || b = c+a){

            type = "One line";
        }*/

    }

}
