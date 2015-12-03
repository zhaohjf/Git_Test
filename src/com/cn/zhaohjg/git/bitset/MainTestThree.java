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
 * java.util.BitSet���԰�λ�洢�� �������һ���ֽڣ�byte��ռ8λ��bit��������java���������ٰ��ֽڴ洢�ģ�
 * ����һ��intռ4���ֽڡ� ������������������������Ȼ����Ҫ�ܴ�洢�ռ���ڴ档 ��μ�������ռ�ô洢�ռ���ڴ�������㷨�����
 * java.util.BitSet���ṩ���������㷨�� ������һ�����֣���Ҫ�洢��source=[3,5,6,9] ��int����Ҫ4*4���ֽڡ�
 * java.util.BitSet���Դ�true/false�� �����java.util.BitSet������ٺܶ࣬��ԭ���ǣ�
 * 1�����ҳ����������ֵmaxvalue=9 2������һ��BitSet bs,����size��maxvalue+1=10
 * 3����������source��bs[source[i]]���ó�true. ����ֵ�ǣ� (0Ϊfalse;1Ϊtrue) bs
 * [0,0,0,1,0,1,1,0,0,1] 3, 5,6, 9 ����һ������Ҫint����Ҫռ4�ֽڹ�32λ����������ֻ����1λ�� ����32:1
 * ������ʡ���˺ܴ�ռ䡣
 * 
 * ˵��Ĭ�ϵĹ��캯������һ��64λ��BitSet��ֵ����false�� �����Ҫ�õ�λ������Ĭ��size,����������64λ�������Ǳ��� BitSet
 * bm1=new BitSet(7); System.out.println(bm1.isEmpty()+"--"+bm1.size()); BitSet
 * bm2=new BitSet(63); System.out.println(bm2.isEmpty()+"--"+bm2.size()); BitSet
 * bm3=new BitSet(65); System.out.println(bm3.isEmpty()+"--"+bm3.size()); BitSet
 * bm4=new BitSet(111); System.out.println(bm4.isEmpty()+"--"+bm4.size());
 * 
 * ����� true--64 true--64 true--128 true--128
 * ˵���������λ������64Ϊ�����ģ�����˵�����벻����һ��64�ľͰ�64�㣬����һ�������� 2���ľͰ�128��
 */
