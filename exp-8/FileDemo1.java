import java.util.Scanner;
import java.io.*;

public class FileDemo1
{
    public static void main(String[] args) throws Exception
    {
        // Open the file.
        Scanner scan=new Scanner(System.in);
        int choice;
	while(true)
	{
		System.out.println ("Enter Your Choice:");
		System.out.println ("1.Read From File 1.");
		System.out.println ("2.Write To File2.");
		System.out.println ("3.Concatenate File1 and File2 to File3");
		System.out.println ("4.Appending Text To File3");
		System.out.println ("5.File3 Word Count");
		System.out.println ("6.Exit Program");
		choice = scan.nextInt ();
		switch(choice)
		{
			case 1:
				try
				{
					FileReader fr = new FileReader ("File1.txt"); 
        				Scanner inFile = new Scanner(fr);
        				// Read lines from the file till end of file
        				while (inFile.hasNextLine())
        				{
        					    // Read the next line.
        					    String line = inFile.nextLine();
        					    // Display the line.
        					    System.out.println(line);
        				}	

	 			       	// Close the file.
				        inFile.close();
				}
				catch (FileNotFoundException e)
				{
					System.out.println ("An Error Occured:File Not Found");
					e.printStackTrace();
				}
			        break;
			case 2:
        			// Open the file.
       				 PrintWriter out = new PrintWriter("File2.txt"); // Step 2

        			// Write the name of four oceans to the file
        			out.println("Atlantic");   // Step 3
        			out.println("Pacific");
        			out.println("Indian");
        			out.println("Arctic");
	
	    	 		   // Close the file.
	        		out.close();  // Step 4
	        		break;
			case 3:
 		       		// PrintWriter object for file3.txt 
 		       		PrintWriter pw = new PrintWriter("File3.txt"); 
        	  
        			// BufferedReader object for file1.txt 
        			BufferedReader br = new BufferedReader(new FileReader("File1.txt")); 
         	 
        			String line = br.readLine(); 
         	 
        			// loop to copy each line of  
        			// file1.txt to  file3.txt 
        			while (line != null) 
        			{ 
				line = br.readLine();
        				 pw.println(line); 
        			    
        			} 
         	 		// BufferedReader object for file2.txt
        			br = new BufferedReader(new FileReader("File2.txt")); 
         	 
       				 line = br.readLine(); 
         	 
     				   // loop to copy each line of  
     				   // file2.txt to  file3.txt 
     				   while(line != null) 
     				   { 
     					     line = br.readLine();
  					     pw.println(line); 
 
      				   } 
         	 
       	 			pw.flush(); 
          
       				 // closing resources 
       				 br.close(); 
       				 pw.close(); 
          
       				 System.out.println("Merged file1.txt and file2.txt into file3.txt"); 
       				 break;
			case 4:
				try 
				{
			System.out.println ("Enter The Information To Append To File3:");
					scan.nextLine ();
					String s = scan.nextLine ();
         		BufferedWriter outa = new BufferedWriter(new FileWriter("File3.txt",true));
         					outa.write (s);
					outa.close();
         			BufferedReader in = new BufferedReader(new FileReader("File3.txt"));
         				String str;
         				while ((str = in.readLine()) != null) 
					{
            					System.out.println(str);
        	 			}
      					in.close();
				}
     				 catch (IOException e) {
         				System.out.println("exception occoured"+ e);
      				}
				break;
			case 5:
				int count =0;
  
      				FileInputStream fis = new FileInputStream("File3.txt");
				InputStreamReader input = new InputStreamReader (fis);
				BufferedReader reader = new BufferedReader (input);
				String word;
				while ((word=reader.readLine ())!=null)
				{
					String [] words = word.split ("\\s+");
					count++;
				}
				reader.close ();
				input.close ();
				fis.close (); 				
      				System.out.println("Number of words in the given file are " +count);
   				break;
			case 6:
				System.exit (1);
        		default:
       				 System.out.println("Enter the Correct Option");
       
		}
	}
    }
}