package Book;

public class Chapter5 {

	public static void main(String[] args) {
		BBSItem b1 = new BBSItem();
		BBSItem b2 = new BBSItem();
		System.out.println(b2.seqNo);
		System.out.println(b1.seqNo);
	}

	class Product {
		int code;
		String name;
		String manufacturer;
		int standardPrice;
		int discountRate;
		
		public Product (int code, String name, String manufacturer, int standardPrice, int discountRate) {
			this.code = code;
			this.name = name;
			this.manufacturer = manufacturer;
			this.standardPrice = standardPrice;
			this.discountRate = discountRate;
		}
		
		public Product (int code, String name, String manufacturer, int standardPrice) {
			this.code = code;
			this.name = name;
			this.manufacturer = manufacturer;
			this.standardPrice = standardPrice;
		}
		
		public void setDiscountRate(int discountRate) {
			this.discountRate = discountRate;
		}
		
		public double getPrice() {
			return standardPrice * (1.0 - discountRate / 100);
		}
	}
}

class BBSItem {
	static int order = 0;
	int seqNo;
	
	public BBSItem() {
		seqNo = ++order;
	}
}