import java.util.*;

public class Model {
    Set<Triangle> triangles;
   // View v;
   public Model(){

       triangles = new HashSet<Triangle>();
       //System.out.println("Enter size");
      // Scanner scanner = new Scanner(System.in);
      //String c = scanner.nextLine();

                int size = 5;

          fullCollection(size);


    }
   private void fullCollection(int c){
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
