//package practice02;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.Scanner;
//
// public static void FavoriteBabyNames() throws ClassNotFoundException {
//List<String> list=new ArrayList<>();
//Scanner input=new Scanner(System.in);
//System.out.println("What year?");
//String year=input.next();
//input.close();
//try(BufferedReader os=new BufferedReader(new FileReader("\\\\PDC\\FolderRedirectionStaff$\\yesil\\Desktop\\baby_Names\\yob"+year+".txt"))){
//			for(int i=1;i<6;i++) {
//			String line=os.readLine();
//			list.add(line);
//			String name=line.substring(0,line.indexOf(","));
//			String gen=line.substring(line.indexOf(",")+1,line.lastIndexOf(","));
//			String gender= gen=="M"?"Male":"Female";
//			String rank= line.substring(line.lastIndexOf(",")+1);
//			System.out.println(i+") Name "+name+" Gender "+gender+" Rank "+rank);
//			}
//			// user yil ve isim
//			
//} catch (FileNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//} catch (IOException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//	
//	
//}	
//}	
//	
//	
//	



