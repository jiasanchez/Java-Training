/**
 * 
 */
package M2_Activity1;

/**
 * 
 */
public class Seatwork1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree Gingko = new Tree();
		Gingko.Autumn();
		
		House Townhouse = new House();
		Townhouse.houseType = "Town house";
		Townhouse.FloorArea = 150;
		
		Townhouse.dispHouse();
		
		Book got = new Book();
		got.BookTitle = "Game of Thrones";
		got.Genre = "Fantasy";
		got.Pages = 300;
		
		got.dispBook();
	}

}
