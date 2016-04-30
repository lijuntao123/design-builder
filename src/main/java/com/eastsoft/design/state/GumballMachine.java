package com.eastsoft.design.state;

/**
 * GumballMachine
 * @author ljt
 * @date 2015年8月8日 下午2:09:58
 */
public class GumballMachine {
	private static final int STATE_SOLD_OUT=0;
	private static final int STATE_HAS_QUARTER=1;
	private static final int STATE_NO_QUARTER=2;
	private static final int STATE_SOLD=3;
	
	private int count;
	private int state;

	public GumballMachine(int count) {
		super();
		this.count = count;
		if(count>0){
			state=STATE_NO_QUARTER;
		}
	}
	
	public void insertQuarter(){
		if(state==STATE_HAS_QUARTER){
			System.out.println("you can not insert another quarter!");
		}else if(state==STATE_NO_QUARTER){
			state=STATE_HAS_QUARTER;
			System.out.println("you insert a quarter");
		}else if(state==STATE_SOLD_OUT){
			System.out.println("you can't insert a quarter,the machine is sold out!");
		}else if(state==STATE_SOLD){
			System.out.println("please wait,we're alrready giving you a gumball!");
			
		}
		System.out.println("you insert a quarter");
	}

}
