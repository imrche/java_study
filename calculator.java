public class calculator {
	private int result;
	
	public  void add ( int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	public  void remove ( int ... params) {
		for (Integer param : params) {
			this.result -= param;
		}
	}
	
	public int get_result () {
		return this.result;
	}
	
	public void clearResult () {
		this.result = 0;
	}

}