public class View {
     Model m;
    View(){
        m = new Model();
    }
    void outPutTypes(){
        for (Triangle t:m.triangles) {
            System.out.println(t.toString());
        }
    }
    void messages(int i){
        String[] m = new String[3];
        m[0] ="1.For output data Tap -1";
        m[1] ="2.For find type and output data Tap -2";
        m[2] ="3.For exit Tap -0";
        System.out.println(m[i]);
    }
}
