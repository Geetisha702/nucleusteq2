import java.util.LinkedList;
import java.util.Queue;



public class queuereverse{

 Queue<String> reverseFirstK(Queue<String> q, int k) {
	solve(q, k);
	int s = q.size() - k;
	while( s-- > 0){
		String x = q.poll();
		q.add(x);
	}
	return q;
}
 void solve(Queue<String> q, int k){
	if(k == 0) return;
	String e = q.poll();
	solve(q, k - 1);
	q.add(e);
}

public  void main (String[] args) {
	Queue<String> queue = new LinkedList<>();
	queue.add("java");
	queue.add("python");
	queue.add("dbms");
	queue.add("dsa");
	queue.add("swift");
	queue.add("android");
	queue.add("blockchain");
	queue.add("cloud");
	

	int k = 5;
	queue = reverseFirstK(queue, k);
	
	while (!queue.isEmpty()) {
		System.out.print(queue.poll() + " ");
	}
}
}
