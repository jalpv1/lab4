import java.util.Scanner;

public class Controller {
    View v;
    //Model m;

    Controller() {
        v = new View();
      //  m = new Model();
    }

    void menu() {
        char c = ' ';
        v.messages(0);
        v.messages(1);
        v.messages(2);
        do {

            Scanner scanner = new Scanner(System.in);
            c = scanner.next().charAt(0);


            switch (c) {
                case '1':

                    v.outPutTypes();
                    break;
                case '2':
                    v.m.getTypes();
                    v.outPutTypes();
                    break;
            }
        }while(c !='0');
    }

}
