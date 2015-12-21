package array;

public class ArrayBasic {
	// member variable
	private int n[];
	private int m[];

	// constructor
	public ArrayBasic(int n[]) {
		this.n = n;
	}

	public ArrayBasic(int a[], int b[]) {
		this.n = a;
		this.m = b;
	}

	// member method
	public int findMax() {

		int max = this.n[0];
		for (int i = 1; i < this.n.length; i++) {
			if (max < this.n[i]) {
				max = this.n[i];
			}
		}

		return max;
	}

	public boolean exists(int x) {
		for (int i = 0; i < this.n.length; i++) {
			if (this.n[i] == x) {
				return true;
			}
		}
		return false;
	}

	public Integer commonNumber() {
		for (int i = 0; i < this.n.length; i++) {
			for (int j = 0; j < this.m.length; j++) {
				if (this.n[i] == this.m[j]) {
					return this.n[i];
				}
			}
		}
		return null;
	}
	/*
	 * public Integer[] commonNumbers(){ Integer common[] = new
	 * Integer[this.n.length]; int k = 0; for(int i=0; i<this.n.length; i++){
	 * for(int j =0; j<this.m.length; j++){ if(this.n[i]==this.m[j]){ common[k]
	 * = this.n[i]; k++; } } } return common; }
	 */

	public void sort() {
		for (int i = 0; i < this.n.length; i++) {
			for (int j = i + 1; j < this.n.length; j++) {
				if (this.n[i] > this.n[j]) {
					int temp = this.n[j];
					this.n[j] = this.n[i];
					this.n[i] = temp;
				}
			}
		}
	}

	public void swap() {
		for (int i = 0; i < this.n.length; i++) {
			for (int j = i + 1; j < this.n.length; j++) {
				if (this.n[i] > this.n[j]) {
					int temp = this.n[j];
					this.n[j] = this.n[i];
					this.n[i] = temp;
					return;
				}
			}
		}
	}

	public int[] merge() {
		int mn[] = new int[this.n.length + this.m.length];
		int k =0;
		for (int i = 0; i < this.n.length; i++) {
			mn[k] = this.n[i];
			k++;
		}
		for (int j = 0; j < this.m.length; j++) {
			mn[k] = this.m[j];
			k++;
		}
		return mn;

	}

	public int[] getN() {
		return n;
	}

}
