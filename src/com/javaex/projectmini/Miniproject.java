package com.javaex.projectmini;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Miniproject {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\miniproject\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);

		List<PhoneDB> pList = new ArrayList<PhoneDB>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
		
		String[] Array = str.split(",");
		String name = Array[0];
		String hp = Array[1];
		String company = Array[2];
		
		PhoneDB p01 = new PhoneDB(name, hp, company);
		pList.add(p01);
		
		}
		
		boolean run = true;
		
		
		
		System.out.println("**************************************************");
		System.out.println("*                전화번호 관리 프로그램                 *");
		System.out.println("**************************************************");
		
		
			while(run) {	
		
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("-----------------------------------");
			System.out.print(">메뉴번호");
			
			int x = sc.nextInt();
			
				switch(x) {
				
					case 1 :
						for(int i = 0; i<pList.size(); i++) {
							System.out.println("이름  :" + pList.get(i).getName());
							System.out.println(" 핸드폰" + pList.get(i).getHp());
							System.out.println(" 회사" + pList.get(i).getCompany());
							System.out.println("");
						}
						break;
				
						
						
					case 2 :
						
						System.out.println("<2.등록>");
						
						System.out.print("이름 :");
						String name = sc.next();
						System.out.println();
						
						
						System.out.print("휴대전화 :");
						String hp = sc.next();
						System.out.println();
						
						System.out.print("회사전화 :");
						String company = sc.next();
						System.out.println();
						
						PhoneDB p01 = new PhoneDB(name, hp, company);
						p01.setName(name);
						p01.setHp(hp);
						p01.setCompany(company);
						
						pList.add(p01);
						
						
						
						Writer wr = new FileWriter("C:\\javaStudy\\file\\miniproject\\PhoneDB.txt");
						BufferedWriter bw = new BufferedWriter(wr);
							
						for(int i = 0; i< pList.size();i++) {
								String str = pList.get(i).getName()+","+ pList.get(i).getHp()+","+pList.get(i).getCompany();
								bw.write(str);
								bw.newLine();
							}
							
							
						System.out.println("등록완료");
							
						bw.flush();
						bw.close();
				
						break;
						
						
						
					 
						
						
						
						
						
						
						
					case 3 :
						
						
						
						
						
					
					case 5 :
						System.out.println("***********************************************");
						System.out.println("*                   감사합니다                   *");
						System.out.println("***********************************************");
						
						run = false;
						break;
						
						
					default :
						System.out.println("[다시 입력해 주세요]");
						break;
						
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*int i = sc.nextInt();
			
			if(i == 1){ //리스트 출력
				for(int x = 0; x<pList.size(); x++) {
				System.out.println(pList.get(x).toString());
				
				}
			}else if(i == 2) { // 등록
				String str = sc.nextLine();
				String[] Array = str.split(",");
				String name = Array[0];
				String hp = Array[1];
				String company = Array[2];
				
				PhoneDB p01 = new PhoneDB(name, hp, company);
				pList.add(p01);
				break;
			}else if(i == 3) {//삭제
				
			}else if(i == 4) {//검색
				
			}else if(i == 5) {//종료
				
			}else {
				System.out.println("다시 선택해주세요");
			}*/
			
		

				
		}
		
			sc.close();
			br.close();

	}
	}

