
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Readfile implements Readable{

    //itt létrehozzuk az adatbeolvasást

    @Override
    public void readContent(){ //kezeljük a kivételeket
        try{
            tryReadContent();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }

    public void tryReadContent()  throws IOException{

      File file = new File("adat.txt");
      Scanner sc = new Scanner(file, Charset.forName("utf-8"));
      StringBuffer sb = new StringBuffer();
        while (sc.hasNext()){
            sb.append(sc.nextLine()); //beolvassuk a következő sort
            sb.append('\n'); //sortörés miatt
        }
        
        String content = sb.toString();
        System.out.println("Tartalom: ");
        System.out.println(content);
        sc.close();
    }
    
}
