package _ch08;

import java.io.File;

public class Exceptiondeclar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f= createFile(args[0]);      // 예외 발생
			System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+"다시 입력해주시기 바랍니다.");
		}	
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName==null|| fileName.equals(""))            
			throw new Exception("파일이름이 유효하지 않습니다.");   // 예외 발생  호출한 메서드로 떠넘김
		File f= new File(fileName);            // File 인스턴스 생성
		// File 개개체의 createNewfile메서드를 이용하여 실제파일을 생성한다.
		f.createNewFile();
		return f;  //생성된 인스턴스 반환  
	}
}
		
		