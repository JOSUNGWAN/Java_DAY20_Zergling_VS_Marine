package Zergling_VS_Marine;

import java.util.Scanner;

public class Starcraft_Main {

	public static void main(String[] args) {

		Unit marine = new Marine();
		marine.country();
		marine.type();
		marine.price();
		marine.weapan();
		marine.damage();
		marine.hp();
		System.out.println("---------------------------");
		Unit zergling = new Zergling();
		zergling.country();
		zergling.type();
		zergling.price();
		zergling.weapan();
		zergling.damage();
		zergling.hp();
		System.out.println("---------------------------");

		Marine matt = new Marine();
		Zergling zatt = new Zergling();
		Scanner sc = new Scanner(System.in);
		int mhp = matt.hp;
		int zhp = zatt.hp;

		System.out.println("유닛을 고르세요. 마린 : 1번, 저글링 : 2번");
		int input1 = sc.nextInt();
		if(input1 == 1) {
			System.out.println("마린을 선택했습니다.");
			
			while(zhp > 0 && mhp > 0 ) {
				System.out.println("공격하려면 1번을 누르세요 잘못 누를시 공격 받음");
				int input2 = sc.nextInt();
				
				if (input2 == 1) {
					System.out.println("공격 성공!");
					System.out.println("---------------");
					zatt.hpDown(6);
					System.out.println("---------------");
					zhp -= 6;
				} else if (input2 != 1) {
					System.out.println("공격 실패!");
					System.out.println("---------------");
					matt.hpDown(5);
					System.out.println("---------------");
					mhp -= 5;
				}
				if (zhp <= 0) {
					System.out.println("이겼습니다.");
				} else if(mhp <= 0) {
					System.out.println("졌습니다.");
				}
			}

		} else if (input1 == 2) {
			System.out.println("저글링 선택했습니다.");
		
			while(zhp > 0 && mhp > 0 ) {
				System.out.println("공격하려면 1번을 누르세요 잘못 누를시 공격 받음");
				int input2 = sc.nextInt();
				
				if (input2 == 1) {
					System.out.println("공격 성공!");
					System.out.println("---------------");
					matt.hpDown(5);
					System.out.println("---------------");
					mhp -= 5;
				} else if (input2 != 1) {
					System.out.println("공격 실패!");
					System.out.println("---------------");
					zatt.hpDown(6);
					System.out.println("---------------");
					zhp -= 6;
				}
				if (mhp <= 0) {
					System.out.println("이겼습니다.");
				} else if(zhp <= 0) {
					System.out.println("졌습니다.");
				}
			}

		}
		sc.close();

	} //main
} //class





