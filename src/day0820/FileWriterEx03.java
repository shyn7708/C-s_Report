package day0820;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx03 {

	FileWriter fw;
	static final String FILENAME="C:\\sist0730\\javawork\\member.txt";
	Scanner sc;
	
	//생성자
	public FileWriterEx03() {
		
		sc=new Scanner(System.in);
	}
	
	//데이타 입력 메서드
	public void dataWrite()
	{
		try {
			fw=new FileWriter(FILENAME, true);
			
			System.out.println("이름?");
			String name=sc.nextLine();
			System.out.println("주소?");
			String addr=sc.nextLine();
			System.out.println("핸드폰?");
			String hp=sc.nextLine();
			
			System.out.println("**파일에 저장됨!!**");
			
			//파일쓰기
			fw.write("회원명: "+name+"\n");
			fw.write("주소: "+addr+"\n");
			fw.write("연락처: "+hp+"\n-----------------\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriterEx03 fw3=new FileWriterEx03();
		fw3.dataWrite();
		
	}

}
