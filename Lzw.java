package com.lzw;
import com.lzw.login.*;
import com.lzw.vcf.Vcf;
import java.util.Scanner;
public class Lzw {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		final Scanner sc=new Scanner(System.in);
		new Login();
		Login.LoginActionListener();
		int a=sc.nextInt();
		if(a==5) {
			Vcf.outvcf();
		}
}

	
}