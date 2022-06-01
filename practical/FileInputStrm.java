package corejava;
//import required packages
import java.io.*;
public class FileInputStrm {

    public static void main(String[] args) throws IOException {
    	//Creating object
        File data = new File("C:\\Users\\amans\\OneDrive\\Documents\\MYfile.txt");  
        FileInputStream  file = new FileInputStream(data);  
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        while((k=filter.read())!=-1){  
            System.out.print((char)k);  
        }  
        //Call close Method
        file.close();  
        filter.close();  
    }  
}  
