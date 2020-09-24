//bMethod07.jpg

package b.method.ex07;

/*
어레이가 똑같은지 안 똑같은지 판단
static에 private 붙은거 생각보다 굉장히 많다
static메소드를 private 하면 나만 공유해서 쓰는 것임 

static은 클래스이름으로 접근할 수 있다!
ArrayCompare.equalsArr(arr1, arr2) 이렇게!

같은 클래스의 static 은 클래스 이름 안 써줘도 되지만
클래스 이름으로 접근하는 습관을 들이자!
 */
public class ArrayCompare {

	//내 클래스에서만 공유해서 쓰는 메소드
	private static boolean equalsArr(int[] arr1, int[] arr2) {

		boolean temp = false; //초기화
		
		if (arr1.length == arr2.length) { //배열의 길이가 같으면
			for (int i = 0; i < arr1.length; i++) { //하나씩 판단
				temp = false; // 뒤의 값들 까지 계속 판단해야 하니 초기화
				if (arr1[i] == arr2[i]) {
					temp = true;
				} else {
					return false;
				}
			}
		} else { //배열의 길이가 같지 않으면 애초에 false
			return false;
		}
		return temp;
	}

	public static void main(String[] args) {

		int[] arr1 = { 3, 5, 6, 9, 10, 2, 7 };
		int[] arr2 = { 3, 5, 6, 9, 10, 2, 7 };
		if (ArrayCompare.equalsArr(arr1, arr2)) { 
			System.out.println("two array equals");
		} else {
			System.out.println("two array not-equals");
		}

		System.out.println("====================");

		int[] arr3 = { 3, 5, 6, 9 };
		int[] arr4 = { 3, 5, 6, 9, 8 };
		if (equalsArr(arr3, arr4)) { // 같은 클래스에서 static 은 클래스명 안 써도 되지만
									// ArrayCompare.equalsArr(arr3, arr4)
									// 클래스 이름으로 접근하는 습관을 들이자!!
			System.out.println("two array equals");
		} else {
			System.out.println("two array not-equals");
		}

	}
}
