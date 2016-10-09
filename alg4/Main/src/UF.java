/*
 * union-find动态连通性问题
 * 关键点：查找效率+合并连通效率
 * 关键词： 树 加权合并
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UF {

	private int[] id;
	private int[] size;
	private int count;
	public UF(int N) {
		count = N;
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
	public int count() {
		return count;
	}
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	public int find(int p) {
		while(p != id[p]) {
			p = id[p];
		}
		return p;
	}
	public void union(int p, int q) {
		int pid = find(p);
		int qid = find(q);
		if (pid == qid) return;
		if (size[pid] < size[qid]) {
			id[pid] = qid;
			size[qid] += size[pid];
		} else {
			id[qid] = pid;
			size[pid] += size[qid];
		}
		count--;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("largeUF.txt"));
		int N = sc.nextInt();
		UF uf = new UF(N);
		long start = System.currentTimeMillis();
		while(sc.hasNext()) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			if (uf.connected(p, q)) continue;
			uf.union(p, q);
//			System.out.println(p + " " + q);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(uf.count() + " components");
	}

}
