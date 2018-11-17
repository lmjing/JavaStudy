package Book;



public class Chapter7 {

	interface Lendable {
		enum State {
			NORMAL, BORROWED;
		}
		void checkOut(String borrower, String date);
		void checkIn();
	}
	
	class SeperateVolume implements Lendable {
		Lendable.State state;
		
		@Override
		public void checkOut(String borrower, String date) {
			if (state != Lendable.State.BORROWED) {
				return;
			}
			this.state = Lendable.State.BORROWED;
		}

		@Override
		public void checkIn() {
			this.state = Lendable.State.NORMAL;
		}
	}
}

