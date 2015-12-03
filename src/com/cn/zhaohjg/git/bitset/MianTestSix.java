package com.cn.zhaohjg.git.bitset;

import java.util.BitSet;

public class MianTestSix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitSet bs = new BitSet(100);
		initBitSet(bs);
		findSushuBitSet(bs);
		printSushuBitSet(bs);
	}

	// 第0,1位置成false，其余全部是true.
	public static void initBitSet(BitSet bs) {
		for (int i = 0; i < bs.size(); i++) {
			if (i == 0 || i == 1) {
				bs.set(i, false);
			} else {
				bs.set(i, true);
			}
		}
	}

	// 处理数据，找到素数
	public static void findSushuBitSet(BitSet bs) {
		for (int i = 0; i < bs.size(); i++) {
			if (bs.get(i)) {
				// 内循环遍历
				for (int j = 2 * i; j < bs.size(); j += i) {
					bs.set(j, false);
				}
			}

		}
	}

	// 位是1的是素数，打印
	public static void printSushuBitSet(BitSet bs) {
		StringBuffer buf = new StringBuffer();
		int num = 0;
		for (int i = 0; i < 100; i++) {
			if (bs.get(i)) {
				buf.append(i + ",");
				num++;
			}

			if ((num + 1) % 20 == 0 && num != 0) {
				buf.append("\n");
			}
		}
		System.out.println(buf.toString());
	}

}

/**
 * 
 * 找出100以内的素数 素数定义：质数，又称素数，指在一个大于1的自然数中，
 * 除了1和此整数自身外，无法被其他自然数整除的数（也可定义为只有1和本身两个因数的数）。 
 * 使用java.util.BitSet求素数的算法：
 * 例如要找100以内的素数， 1，声明一个BitSet bs，第0,1位置false；其余位是true。
 * 2，从2开始遍历bs，如果是true就进行内循环遍历。
 * 3，内循环遍历：从外向内环i开始遍历bs，每次增长一个i（这个很重要），把内循环j在bs中的位置成false。 
 * 代码如下 
 * for(inti=0;i<bs.size();i++){ 
 * 	  if(bs.get(i)){//内循环遍历 
 *      for(int j=2*i;j<bs.size();j+=i){
 *         bs.set(j, false); 
 *      }
 *    } 
 * } 
 * （因为素数只能被1和它本身整出，所以就把事它2倍，3倍，4倍....的数全过滤掉）
 */
