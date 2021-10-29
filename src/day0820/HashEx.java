package day0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//제네릭-명시한 자료형
//컬렉션: 자료구조(set,vector,arrayList)  <자료형>
//(인터페이스명 or 클래스명)<데이터형> 객체이름 =new 클래스명<데이터형>
//컬렉션과 배열의 차이
//복수자료형의 저장이 가능하다...크기가 가변적이다
//List : 순서가 중요할때,중복가능
//Set : 유일성이 중요할때..순서는 안지켜짐
//Map : key값으로 value값을 찾을때

public class HashEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<String>();
		//HashSet<String> set1=new HashSet<String>();
		//set안에 String 데이타만 담겠다-Set은 인터페이스 이므로
		
		set1.add("사과");
		set1.add("바나나");
		set1.add("사과"); //중복은 포함하지 않는다
		set1.add("딹기");
		set1.add("키위");
		set1.add("포도");
		
		System.out.println("데이터개수: "+set1.size());//개수
		
		System.out.println("#출력1");
		for(String s:set1)
			System.out.println(s);
		//꺼내서 출력하는 인터페이스 Iterlator
		//컬렉션 인터페이스에 정의된 메소드,List,Set도 포함
		//Iterlator 를 얻은다음에 반복문,while을 돌려서 읽어온다
		
		System.out.println("#출력2");
		
		Iterator<String>iter=set1.iterator();
		
		while(iter.hasNext()) //데이터가 더이상 없으면 false
		{
			//마지막요소까지 다음값 돌려줌
			String s=iter.next();
			//다음으로 이동함과동시에 데이터반환
			System.out.println(s);
		}
		
		System.out.println("#출력3");
		Object []ob=set1.toArray();
		for(int i=0;i<ob.length;i++)
		{
			System.out.println(ob[i]);
		}
		
		//모든데이터 삭제
		set1.clear();
		
		if(set1.isEmpty())
			System.out.println("Set 타입안에 데이터가 없다");
		else
			System.out.println("Set 타입안에 데이터가 있다");
	}

}
