import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
  private static final String LINE_SEPARATOR = System.lineSeparator();

  public static void main(String[] args) {
    final String fileName = "Test.txt";
		final String fileName2 = "Main.java";
	  //FileReader file2 = new FileReader("Main.java");	
		//String fi = String.valueOf(file2);
		//FileReader filereader = new FileReader(file2);
	  //final String content = "abc";
		
		
	  if (writeToFile(fileName, readFromFile(fileName2))) {
	    System.out.println(String.format("ファイルの書き込みに成功しました: %s", fileName));
		} else {
	    System.out.println(String.format("ファイルの書き込みに失敗しました: %s", fileName));	
		}	
	}
  
	public static String readFromFile(String fileName2) {
		File file2 = new File(fileName2);
    StringBuilder sb = new StringBuilder();

		try (
				FileReader fr = new FileReader(file2);
				BufferedReader br = new BufferedReader(fr);
    ){
			  String line;
				while ((line = br.readLine()) != null) {
					sb.append(line).append(LINE_SEPARATOR);
				}

				return sb.toString();
			} catch (FileNotFoundException e) {
			    System.err.println(String.format("ファイルが見つかりません: %s", fileName2));
				  return null;
			} catch (IOException e) {
			    System.err.println(String.format("ファイル読み込みに失敗しました: %s", fileName2));
				  return null;
			}
	}	
	private static boolean writeToFile(String fileName, String context) {
	  File file = new File(fileName);
		try (
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
	  ){
        pw.println(context);
	      return true;
		} catch (IOException e) {
        return false;
    }				
	}
}
