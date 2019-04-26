import java.util.*;

public class Model {
    Set<Triangle> triangles;
   // View v;
   public Model(){
      /* for (Triangle triangle : triangles = new HashSet<Triangle>()) {
           triangle = new Triangle();
           triangle.createTrangle();
       }*/
       triangles = new HashSet<Triangle>();
     //  v = new View();
       System.out.println("Enter size");
       Scanner scanner = new Scanner(System.in);
      String c = scanner.nextLine();

      int size = Integer.parseInt(c);
      if(size >=0) {

          fullCollection(size);
     }
     else{
          System.out.println("Wrong size");
      }
    }
   public void fullCollection(int c){
       for(int i =0; i<=c-1;i++){
           Triangle triangle = new Triangle();
           triangles.add(triangle);
       }

   }
   public void getTypes(){
      /* for(int i =0 ;i<triangles.size();i++){
           //triangles.
       }*/
      for (Triangle t:triangles) {
           t.typeOfTriangle();
           //v.outPutTypes();

       }


   }

}
