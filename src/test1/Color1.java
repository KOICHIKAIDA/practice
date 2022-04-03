package test1;

import java.util.Arrays;
import java.util.List;

class Color1 {
	String getColor(int i) {
		
		if (i == 1) {
			return "赤";

		} else if (i == 2) {
			return "青";
			
		} else {
			return "1or2を入力して下さい";
		}
	}
	
	boolean isRed(int i) {
		
		if (i == 1) {
			return true;

		} else {
			return false;
			
		}
	}
	
	String isNull(int i) {
		
		if (i == 1) {
			return null;

		} else {
			return "";
			
		}
	}
	
	int[] array(int i) {
		
		int[] returnArray = {1, 2, 3};
		
		if (i == 1) {
			returnArray[0] = 1;

		} else {
			returnArray[0] = 2;
			
		}
		
		return returnArray;
	}

	public List<String> iteratable(int i) {
		List<String> expected = Arrays.asList("a", "b", "c");
		if (i == 1) {
			return expected;
		} else {
			return null;
		}
	}

}