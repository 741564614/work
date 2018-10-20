package com.lzw.vcf;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import com.lzw.dao.*;
import java.io.UnsupportedEncodingException;
import com.lzw.dao.model.*;
public class Vcf {
	 public static void outvcf() {
		 
		 try {
			 List<Information> information=Getinformation.getinformation();
				File file = new File("src/export_contacts.vcf");
				if (file.exists()) {
					file.createNewFile();
				}
				BufferedWriter reader = new BufferedWriter(new PrintWriter(file));
				for (Information bean : information) {
					reader.write("BEGIN:VCARD");
					reader.write("\r\n");
					reader.write("VERSION:2.1");
					reader.write("\r\n");
					reader.write("N;CHARSET=UTF-8;ENCODING=QUOTED-PRINTABLE:" + Vcf.qpEncodeing(bean.getTrueName()) + ";");
					reader.write("\r\n");
					if ("" != bean.getMobile() && bean.getMobile() != null) {
						reader.write("TEL;CELL:" + bean.getMobile() + "");
						reader.write("\r\n");
					}
					
					reader.write("END:VCARD");
					reader.write("\r\n");
				}
				reader.flush();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	 }
	 public static String qpEncodeing(String str)
     {
         char[] encode = str.toCharArray();
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < encode.length; i++)
         {
             if ((encode[i] >= '!') && (encode[i] <= '~') && (encode[i] != '=')
                     && (encode[i] != '\n'))
             {
                 sb.append(encode[i]);
             }
             else if (encode[i] == '=')
             {
                 sb.append("=3D");
             }
             else if (encode[i] == '\n')
             {
                 sb.append("\n");
             }
             else
             {
                 StringBuffer sbother = new StringBuffer();
                 sbother.append(encode[i]);
                 String ss = sbother.toString();
                 byte[] buf = null;
                 try
                 {
                     buf = ss.getBytes("utf-8");
                 }
                 catch (UnsupportedEncodingException e)
                 {
                     e.printStackTrace();
                 }
                 if (buf.length == 3)
                 {
                     for (int j = 0; j < 3; j++)
                     {
                         String s16 = String.valueOf(Integer.toHexString(buf[j]));
                         // 抽取中文字符16进制字节的后两位,也就是=E8等号后面的两位,
                         // 三个代表一个中文字符
                         char c16_6;
                         char c16_7;
                         if (s16.charAt(6) >= 97 && s16.charAt(6) <= 122)
                         {
                             c16_6 = (char) (s16.charAt(6) - 32);
                         }
                         else
                         {
                             c16_6 = s16.charAt(6);
                         }
                         if (s16.charAt(7) >= 97 && s16.charAt(7) <= 122)
                         {
                             c16_7 = (char) (s16.charAt(7) - 32);
                         }
                         else
                         {
                             c16_7 = s16.charAt(7);
                         }
                         sb.append("=" + c16_6 + c16_7);
                     }
                 }
             }
         }
         return sb.toString();
     }

}
