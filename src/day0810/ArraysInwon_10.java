package day0810;

import java.util.Scanner;

public class ArraysInwon_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inwon;
		String[] name;
		int[]score;
		int[]rank;
		int tot=0;
		double avg=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�ο����� �Է��Ͻÿ�");
		inwon=Integer.parseInt(sc.nextLine());
		
		name=new String[inwon];
		score=new int[inwon];
		rank=new int[inwon];
		
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+1+"���� �̸���?");
			name[i]=sc.nextLine();
			System.out.println(i+1+"���� ������?");
			score[i]=Integer.parseInt(sc.nextLine());
			
			tot+=score[i];
		}
		
		for(int i=0;i<inwon;i++)
		{
			for(int j=0;j<inwon;j++) 
			{
				if(score[i]<score[j])
					rank[i]++;
			}
		}
		
		avg=(double)tot/inwon;
		
		System.out.println("No.\t�̸�\t����\t���");
		System.out.println("-----------------------------");
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		System.out.println("=================");
		
		System.out.println("����: "+tot);
		System.out.println("���: "+avg);
		

	}

}
