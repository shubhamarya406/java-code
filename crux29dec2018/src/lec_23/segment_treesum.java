package lec_23;

public class segment_treesum implements segmentsum {

	@Override
	public int operation(int left, int right) {
		return left+right;
	}

	@Override
	public int defaultvalue() {
		

		return 0;
	}

	
	
}
