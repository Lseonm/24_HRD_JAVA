package day05;


interface Action {
	public void work();
}







public class ActionEx {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();

	}

}
