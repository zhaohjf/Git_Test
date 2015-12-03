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

	// ��0,1λ�ó�false������ȫ����true.
	public static void initBitSet(BitSet bs) {
		for (int i = 0; i < bs.size(); i++) {
			if (i == 0 || i == 1) {
				bs.set(i, false);
			} else {
				bs.set(i, true);
			}
		}
	}

	// �������ݣ��ҵ�����
	public static void findSushuBitSet(BitSet bs) {
		for (int i = 0; i < bs.size(); i++) {
			if (bs.get(i)) {
				// ��ѭ������
				for (int j = 2 * i; j < bs.size(); j += i) {
					bs.set(j, false);
				}
			}

		}
	}

	// λ��1������������ӡ
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
 * �ҳ�100���ڵ����� �������壺�������ֳ�������ָ��һ������1����Ȼ���У�
 * ����1�ʹ����������⣬�޷���������Ȼ������������Ҳ�ɶ���Ϊֻ��1�ͱ������������������� 
 * ʹ��java.util.BitSet���������㷨��
 * ����Ҫ��100���ڵ������� 1������һ��BitSet bs����0,1λ��false������λ��true��
 * 2����2��ʼ����bs�������true�ͽ�����ѭ��������
 * 3����ѭ���������������ڻ�i��ʼ����bs��ÿ������һ��i���������Ҫ��������ѭ��j��bs�е�λ�ó�false�� 
 * �������� 
 * for(inti=0;i<bs.size();i++){ 
 * 	  if(bs.get(i)){//��ѭ������ 
 *      for(int j=2*i;j<bs.size();j+=i){
 *         bs.set(j, false); 
 *      }
 *    } 
 * } 
 * ����Ϊ����ֻ�ܱ�1�����������������ԾͰ�����2����3����4��....����ȫ���˵���
 */
