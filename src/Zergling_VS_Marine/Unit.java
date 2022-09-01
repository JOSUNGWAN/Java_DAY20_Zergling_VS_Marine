package Zergling_VS_Marine;

public class Unit implements All_Kind {

	@Override
	public void country() {}
	@Override
	public void type() {}
	@Override
	public void price() {}
	@Override
	public void weapan() {}
	@Override
	public void damage() {}
	@Override 
	public void hp() {}
}

class Marine extends Unit {
	public int hp = 45;
	@Override
	public void country() { System.out.println("country : Earth"); }
	@Override
	public void type() { System.out.println("type : Human"); }
	@Override
	public void price() { System.out.println("price : 50 mineral"); }
	@Override
	public void weapan() { System.out.println("weapan : Gun"); }

	@Override
	public void damage() { System.out.println("damage : 6");}

	public void hp() { System.out.println("Hp : " + hp); }

	public int hpDown (int a) {
		hp -= a;
		if(hp <= 0) System.out.println("Marine Die");
		else System.out.println("Marine Hp : " + hp);
		return hp;
	}
}

class Zergling  extends Unit {
	public int hp = 35;
	@Override
	public void country() { System.out.println("country : Galaxy"); }
	@Override
	public void type() { System.out.println("type : 'Xenomorph"); }
	@Override
	public void price() { System.out.println("price : 50 mineral"); }
	@Override
	public void weapan() { System.out.println("weapan : Claws"); }

	@Override
	public void damage() { System.out.println("damage : 5");}

	public void hp() { System.out.println("Hp : " + hp); }

	public int hpDown (int a) {
		hp -= a;
		if(hp <= 0) System.out.println("Zergling Die");
		else System.out.println("Zergling Hp : " + hp);
		return hp;
	}
}


