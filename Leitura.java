import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

     public String entDados(String rotulo){

	System.out.println(rotulo);
	String resp = "";

	InputStreamReader tec = new InputStreamReader(System.in);
	BufferedReader buff = new BufferedReader(tec);

	try{

		resp = buff.readLine();

	}
	catch(IOException ioe){
		System.out.println("\n\tERRO: JVM  - RAM");
	}

	return resp;
    }

}