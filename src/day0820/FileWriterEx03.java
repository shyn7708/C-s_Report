package day0820;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx03 {

	FileWriter fw;
	static final String FILENAME="C:\\sist0730\\javawork\\member.txt";
	Scanner sc;
	
	//������
	public FileWriterEx03() {
		
		sc=new Scanner(System.in);
	}
	
	//����Ÿ �Է� �޼���
	public void dataWrite()
	{
		try {
			fw=new FileWriter(FILENAME, true);
			
			System.out.println("�̸�?");
			String name=sc.nextLine();
			System.out.println("�ּ�?");
			String addr=sc.nextLine();
			System.out.println("�ڵ���?");
			String hp=sc.nextLine();
			
			System.out.println("**���Ͽ� �����!!**");
			
			//���Ͼ���
			fw.write("ȸ����: "+name+"\n");
			fw.write("�ּ�: "+addr+"\n");
			fw.write("����ó: "+hp+"\n-----------------\n");
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
