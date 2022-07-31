package br.fag.aula08;



	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;

	public class MegaSena2{
	    public static void main(String[] args) {
	        Path file = Paths.get("./src/br/fag/aula08/megasena.xls");
	        MegaSena2 n = new MegaSena2(file, 'e');
	        System.out.println(n.count());
	    }

	    private Path file;
	    private char lookFor;

	    MegaSena2(Path file, char lookFor){
	        this.file = file;
	        this.lookFor = lookFor;
	    }

	    private int count(){
	        int count = 0;
	        try(BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(file)))){
	            String line = null;
	            while((line = br.readLine()) != null){
	                for(int i = 0; i < line.length(); i++){
	                    if(line.charAt(i) == lookFor){
	                        count++;
	                    }
	                }
	            }
	        } catch (IOException x){
	            System.err.println(x);
	        }
	        return count;
	    }
	}
