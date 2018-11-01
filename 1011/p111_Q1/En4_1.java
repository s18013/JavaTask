
public class En4_1 {
	public static void main(String[] args) {
		Item pencilA = new Item("umi-hb-001", "umi HB", "四菱鉛筆", 120);
//	  Item pencilB = new Item("umi-hb-001", "umi HB", "四菱鉛筆", 120);
//    Item pencilB = new Item("Umi-hb-001", "umi HB", "四菱鉛筆", 120);
//    Item pencilB = new Item("umi-hb-001", "umi 2B", "四菱鉛筆", 120);
//    Item pencilB = new Item("umi-hb-001", "umi HB", "四鉛筆", 120);
    Item pencilB = new Item("umi-hb-001", "umi HB", "四菱鉛筆", 10);

		checkEquals(pencilA,pencilB);
	}

	public static void checkEquals(Item item1, Item item2) {
		if (item1.equals(item2)) {
		 System.out.println(item1.getName() + "と" + item2.getName() + "とは等しいです");
		} else {
	 	 System.out.println(item1.getName() + "と" + item2.getName() + "とは等しくありません");
		}
	}
}
