import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			runProgram();
	}
	
	// ham tìm kí tự random trong { _ - . }
	   private static java.lang.String getRandomKiTu() {
	    	 String[] listChar = {"-", "_", "."};
	 		String getRandChar = listChar[new Random().nextInt(listChar.length)];
	 		return getRandChar;
		}
	   // hàm hiển thị 
	  public static void inLuaChon_RanOrIndex() {
			System.out.println("=========================");
			System.out.println("1. Ngau nhien so thu tu");
			System.out.println("2. Theo thu tu");
			System.out.println("3. Exit");
			System.out.println("=========================");
	  }
	    
	  public static void case1_NgauNhienStt() {
		  Scanner scan = new Scanner(System.in);
			System.out.println("---------------------");
			System.out.println("Nhap so luong ");
			
			System.out.println("Nhap so dau: ");
			int soDau_soLuong = scan.nextInt();
			
			System.out.println("Nhap so cuoi: ");
			int soCuoi_soLuong = scan.nextInt();
			
			scan.nextLine();
			System.out.println("---------------------");
			System.out.println("Vui long nhap user: ");
			String user = scan.nextLine();
			
			System.out.println("---------------------");
			System.out.println("nhap Domain: ");
			String domain =  scan.nextLine();
			
			System.out.println("---------------------");
			System.out.println("Nhap ki tự");
			System.out.println("1. Khong can ki tu");
			System.out.println("2. Can Ki tu");
			System.out.println("3. Random Ki Tu \"-\" hoac \"_\" hoac \".\" ");
			
		int luaChonKiTu;
		// lay ngau nhien so va la so duy nhat khong lap lai
					ArrayList<Integer> list = new ArrayList<Integer>();
			        for (int i=soDau_soLuong; i<soCuoi_soLuong; i++) list.add(i);
			        Collections.shuffle(list);		
		// lay ngau nhien so va la so duy nhat khong lap lai
		do {
		
			System.out.println("Nhap lua Chon: ");
			luaChonKiTu = scan.nextInt();
			
		}while (luaChonKiTu <1 || luaChonKiTu >4);
		
		// khối switch để tìm luaChonKiTu
		switch(luaChonKiTu) {
		
		case 1: 		
			System.out.println("list Email: ");
 
			for (int i = soDau_soLuong; i<= soCuoi_soLuong; i++) {
				
				System.out.println(user + list.get(i) + "@" + domain);				
			}		
		
		case 2: 
			String c=scan.nextLine(); // bắt kí tự thừa Enter
			String kiTu;
			
			boolean checkKiTu, checkKiTu2;
			
			do {
				System.out.println("Nhap ki tu: ");	
				kiTu = scan.nextLine();
			}while (kiTu.equals("-") == false && kiTu.equals("_") == false && kiTu.equals(".") ==false );
							
			System.out.println("list Email: ");
			for (int i = soDau_soLuong; i<= soCuoi_soLuong; i++) {
				
				System.out.println(user + kiTu + list.get(i) + "@" + domain);
			}			
		
		case 3:	
			System.out.println("list Email: ");
			for (int i = soDau_soLuong; i<= soCuoi_soLuong; i++) {
				
				System.out.println(user + getRandomKiTu() + list.get(i) + "@" + domain);				
			}						
		}
	
	  }
	  
	  public static void case2_RandomStt() {
		  Scanner scan = new Scanner(System.in);
			System.out.println("---------------------");
			System.out.print("Nhap so luong ");
			
			System.out.println("Nhap so dau: ");
			int soDau_soLuong2 = scan.nextInt();
			
			System.out.println("Nhap so cuoi: ");
			int soCuoi_soLuong2 = scan.nextInt();
			
			scan.nextLine();
			System.out.println("---------------------");
			System.out.println("Vui long nhap user: ");
			String user2 = scan.nextLine();
			
			System.out.println("---------------------");
			System.out.println("nhap Domain: ");
			String domain2 =  scan.nextLine();
			
			System.out.println("---------------------");
			System.out.println("Nhap ki tự");
			System.out.println("1. Khong can ki tu");
			System.out.println("2. Can Ki tu");
			System.out.println("3. Random Ki Tu \"-\" hoac \"_\" hoac \".\" ");
			int luaChonKiTu2;
			
			do {
			
				System.out.println("Nhap lua Chon: ");
				luaChonKiTu2 = scan.nextInt();
				
			}while (luaChonKiTu2 <1 || luaChonKiTu2 >3);
			
			// khối switch để tìm luaChonKiTu
			switch(luaChonKiTu2) {
			
			case 1: {		
				System.out.println("list Email: ");
       
				for (int i = soDau_soLuong2; i<= soCuoi_soLuong2; i++) {
					
					System.out.println(user2 + i + "@" + domain2);
				}
				
			}
			
			break;
			
			case 2: 
				String c=scan.nextLine(); // bắt kí tự thừa Enter
				String kiTu;
				
				boolean checkKiTu, checkKiTu2;
				
				do {
					System.out.println("Nhap ki tu: ");	
					kiTu = scan.nextLine();
				}while (kiTu.equals("-") == false && kiTu.equals("_") == false && kiTu.equals(".") ==false );
								
				System.out.println("list Email: ");
				for (int i = soDau_soLuong2; i<= soCuoi_soLuong2; i++) {
					
					System.out.println(user2+ kiTu + i + "@" + domain2);
				}
				break;
			case 3:	
				System.out.println("list Email: ");
				for (int i = soDau_soLuong2; i<= soCuoi_soLuong2; i++) {
					
					System.out.println(user2 + getRandomKiTu() + i + "@" + domain2);
				}
			}
	  }
	  public static void runProgram() {
		  inLuaChon_RanOrIndex();
		  Scanner scan = new Scanner(System.in);
			Random random = new Random();
			int luaChon;
		
			do {
				
				System.out.print("Nhap lua chon: ");
				luaChon = scan.nextInt();	
				
			}while (luaChon <1 || luaChon >3);
			switch(luaChon) {
			case 1:			
				case1_NgauNhienStt();		
				break;
				
			case 2:
				case2_RandomStt();	
				break;
		
			case 3:
				System.out.println("Exited");
				break;
			}
	  }
}
