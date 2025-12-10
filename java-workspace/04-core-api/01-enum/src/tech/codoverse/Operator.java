package tech.codoverse;

public enum Operator {
	PLUS {
		@Override
		public int apply(int a, int b) {
			return a + b;
		}
	},
	MINUS {
		@Override
		public int apply(int a, int b) {
			return a - b;
		}
	};

	public abstract int apply(int a, int b);
}
