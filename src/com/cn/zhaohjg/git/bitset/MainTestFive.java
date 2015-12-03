package com.cn.zhaohjg.git.bitset;

import java.util.BitSet;

public class MainTestFive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] shu = { 2, 42, 5, 6, 6, 18, 33, 15, 25, 31, 28, 37 };
		BitSet bm1 = new BitSet(MainTestFive.getMaxValue(shu));
		System.out.println("bm1.size()--" + bm1.size());

		MainTestFive.putValueIntoBitSet(shu, bm1);
		printBitSet(bm1);
	}

	// ��ʼȫ��Ϊfalse���������Բ��ã���ΪĬ�϶���false
	public static void initBitSet(BitSet bs) {
		for (int i = 0; i < bs.size(); i++) {
			bs.set(i, false);
		}
	}

	// ��ӡ
	public static void printBitSet(BitSet bs) {
		StringBuffer buf = new StringBuffer();
		buf.append("[\n");
		for (int i = 0; i < bs.size(); i++) {
			if (i < bs.size() - 1) {
				buf.append(MainTestFive.getBitTo10(bs.get(i)) + ",");
			} else {
				buf.append(MainTestFive.getBitTo10(bs.get(i)));
			}
			if ((i + 1) % 8 == 0 && i != 0) {
				buf.append("\n");
			}
		}
		buf.append("]");
		System.out.println(buf.toString());
	}

	// �ҳ����ݼ������ֵ
	public static int getMaxValue(int[] zu) {
		int temp = 0;
		temp = zu[0];
		for (int i = 0; i < zu.length; i++) {
			if (temp < zu[i]) {
				temp = zu[i];
			}
		}
		System.out.println("maxvalue:" + temp);
		return temp;
	}

	// ��ֵ
	public static void putValueIntoBitSet(int[] shu, BitSet bs) {
		for (int i = 0; i < shu.length; i++) {
			bs.set(shu[i], true);
		}
	}

	// true,false����1,0Ϊ�˺ÿ�
	public static String getBitTo10(boolean flag) {
		String a = "";
		if (flag == true) {
			return "1";
		} else {
			return "0";
		}
	}

}

/**
 * 
 * ����������˴�ֵ��ȡֵ�� 
 * ע��������ظ������ֹ��ˣ�����˵��һ�����ֳ��ֹ�����2�ε������ǳ�1. ���ֵĴ��������Ϣ�Ͷ���
 */
