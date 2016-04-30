package com.eastsoft.design.builder;

import java.io.IOException;
import sun.misc.BASE64Decoder; 
import junit.framework.TestCase;

/**
 * TestMy
 * 
 * @author ljt
 * @date 2015年5月25日 下午1:54:34
 */
public class TestMy extends TestCase {
	public static void main(String[] args) {

//		byte [] byt={1,2,3,4,5,6,7};
//		
//		ByteBuffer bb=ByteBuffer.wrap(byt);
//		
//		byte[] b1=bb.array();
//		
//		System.out.println();
		
		
	}
	/**
	 * 2015-5-30 09:13:57
	 */
	public static void basedeocode(){
		String data="AZN6AGUCIAA";
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] bb = null;
		try {
			bb = decoder.decodeBuffer(data);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
