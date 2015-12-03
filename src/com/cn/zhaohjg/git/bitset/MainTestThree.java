package com.cn.zhaohjg.git.bitset;

import java.util.BitSet;

/**
 * 
 * @author Administrator
 *
 */

public class MainTestThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitSet bm = new BitSet();
		System.out.println(bm.isEmpty() + "--" + bm.size());
		bm.set(0);
		System.out.println(bm.isEmpty() + "--" + bm.size());
		bm.set(1);
		System.out.println(bm.isEmpty() + "--" + bm.size());
		System.out.println(bm.get(65));
		System.out.println(bm.isEmpty() + "--" + bm.size());
		bm.set(65);
		System.out.println(bm.isEmpty() + "--" + bm.size());
	}

}

/**
 * java.util.BitSet可以按位存储。 计算机中一个字节（byte）占8位（bit），我们java中数据至少按字节存储的，
 * 比如一个int占4个字节。 如果遇到大的数据量，这样必然会需要很大存储空间和内存。 如何减少数据占用存储空间和内存可以用算法解决。
 * java.util.BitSet就提供了这样的算法。 比如有一堆数字，需要存储，source=[3,5,6,9] 用int就需要4*4个字节。
 * java.util.BitSet可以存true/false。 如果用java.util.BitSet，则会少很多，其原理是：
 * 1，先找出数据中最大值maxvalue=9 2，声明一个BitSet bs,它的size是maxvalue+1=10
 * 3，遍历数据source，bs[source[i]]设置成true. 最后的值是： (0为false;1为true) bs
 * [0,0,0,1,0,1,1,0,0,1] 3, 5,6, 9 这样一个本来要int型需要占4字节共32位的数字现在只用了1位！ 比例32:1
 * 这样就省下了很大空间。
 * 
 * 说明默认的构造函数声明一个64位的BitSet，值都是false。 如果你要用的位超过了默认size,它会再申请64位，而不是报错。 BitSet
 * bm1=new BitSet(7); System.out.println(bm1.isEmpty()+"--"+bm1.size()); BitSet
 * bm2=new BitSet(63); System.out.println(bm2.isEmpty()+"--"+bm2.size()); BitSet
 * bm3=new BitSet(65); System.out.println(bm3.isEmpty()+"--"+bm3.size()); BitSet
 * bm4=new BitSet(111); System.out.println(bm4.isEmpty()+"--"+bm4.size());
 * 
 * 输出： true--64 true--64 true--128 true--128
 * 说明你申请的位都是以64为倍数的，就是说你申请不超过一个64的就按64算，超过一个不超过 2个的就按128算
 */
