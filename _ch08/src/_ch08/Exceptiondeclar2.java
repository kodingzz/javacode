package _ch08;

import java.io.File;

public class Exceptiondeclar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f= createFile(args[0]);      // ���� �߻�
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+"�ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}	
	}
	
	static File createFile(String fileName) throws Exception{
		if(fileName==null|| fileName.equals(""))            
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");   // ���� �߻�  ȣ���� �޼���� ���ѱ�
		File f= new File(fileName);            // File �ν��Ͻ� ����
		// File ����ü�� createNewfile�޼��带 �̿��Ͽ� ���������� �����Ѵ�.
		f.createNewFile();
		return f;  //������ �ν��Ͻ� ��ȯ  
	}
}
		
		