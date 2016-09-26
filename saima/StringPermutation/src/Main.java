import java.util.Arrays;

public class Main {
	/**
	 * �ݹ��ҳ�ȫ����
	 * */
	public static void permutation(char[] buf, int start, int end) {
		if (start == end) {
			System.out.println(String.valueOf(buf));
		} else {
			for (int i = start; i <= end; i++) {
				char tmp = buf[i];
				buf[i] = buf[start];
				buf[start] = tmp;
				
				permutation(buf, start+1, end);
				
				tmp = buf[start];
				buf[start] = buf[i];
				buf[i] = tmp;
			}
		}
	}
	
	public static void dicFindPermutation(char[] buf) {
		System.out.println(String.valueOf(buf));
		char[] buf2 = Arrays.copyOf(buf, buf.length);
		while(findNextPermutation(buf));
		while(findPrePermutation(buf2));
	}
	
	/**
	 * �ֵ����ҳ�������֮��ĵ�����
	 * */
	public static boolean findNextPermutation(char[] buf) {
		if (buf.length <= 1) {
			System.out.println(String.valueOf(buf));
			return false;
		}
		int check = 0;
		for (; check < buf.length - 1 && buf[check] > buf[check+1]; check++);
		if (check == buf.length - 1) {
			return false;
		}
		
		int l, r;
		//�����ʼ�ҳ���һ������, buf[l]
		for (l = buf.length - 2; buf[l] > buf[l+1] && l >= 0; l--);
		//�����ʼ�ҳ���һ����buf[l]���, buf[r]
		//ps:��������[l+1....]�У������b[i] < b[l]�����!
		for (r = buf.length - 1; buf[r] <= buf[l] && r >= l; r--);
		//�ҵ��˾ͽ���
		swap(buf, l, r);
		//������ͷ�ת�Ӵ�[l+1...]
		//ps:��ת�õ���������[l+1....],Ȼ�����ܿ�ʼ��һ��
		int mid = (buf.length - l) / 2 + l;
		for (int i = l + 1, j = 1; i <= mid; i++, j++) {
			swap(buf, i, buf.length-j);
		}
		System.out.println(String.valueOf(buf));
		return true;
	}
	/**
	 * �ֵ����ҳ�������֮ǰ�ĵ�����
	 * */
	public static boolean findPrePermutation(char[] buf) {
		if (buf.length <= 1) {
			System.out.println(String.valueOf(buf));
			return false;
		}
		int check = 0;
		for (; check < buf.length - 1 && buf[check] < buf[check+1]; check++);
		if (check == buf.length - 1) {
			return false;
		}
		
		int l, r;
		for (l = buf.length - 2; buf[l] < buf[l+1] && l >= 0; l--);
		for (r = buf.length - 1; buf[r] >= buf[l] && r >= l; r--);
		swap(buf, l, r);
		int mid = (buf.length - l) / 2 + l;
		for (int i = l + 1, j = 1; i <= mid; i++, j++) {
			swap(buf, i, buf.length-j);
		}
		System.out.println(String.valueOf(buf));
		return true;
	}
	
	private static void swap(char[] buf, int l, int r) {
		char tmp = buf[l];
		buf[l] = buf[r];
		buf[r] = tmp;
	}
	
    public static void main(String[] args) {
    	char[] buf = {'b', 'c', 'a'};
//    	permutation(buf, 0, 2);
    	dicFindPermutation(buf);
    }
}
