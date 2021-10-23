import java.util.*;
interface Comparable<sidekick>{
	public int compareto(sidekick sd);
}
class sidekick implements Cloneable,Comparable<sidekick> {
	protected final String name;
	protected float XP;
	protected float HP;
	protected int attack;
	protected int outof;
	sidekick(String name,float XP,float HP,int attack,int outof){
		this.name=name;
		this.HP=HP;
		this.XP=XP;
		this.attack=attack;
		this.outof=outof;
	}
	protected sidekick clone() {
		try {
		sidekick cloned = (sidekick)super.clone();
	    return cloned;
	    }
	    catch (CloneNotSupportedException e) {
			return null;
		}
	}
	@Override
	public boolean equals(Object o1) {
		if(o1!=null&& getClass()==o1.getClass()) {
			sidekick o=(sidekick) o1;
			return (name==o.name&&XP==o.XP&& HP==o.HP&&attack==o.attack&&outof==o.outof);
		}
		else {
			return false;
		}
	}
	@Override
	public int compareto(sidekick sd) {
		if((name==sd.name&&XP==sd.XP&& HP==sd.HP&&attack==sd.attack&&outof==sd.outof))
			return 1;
		else
			return 0;
	}
	public void set_sidekickHP(float HP) {
		this.HP=HP;
	}
	public void set_sidekickXP(float XP) {
		this.XP=XP;
	}
	public void set_sidekickattack(int attack) {
		this.attack=attack;
	}
	public void set_sidekickoutof(int outof) {
		this.outof=outof;
	}
	public String get_sidekickname() {
		return this.name;
	}
	public float get_sidekickHP() {
		return this.HP;
	}
	public float get_sidekickXP() {
		return this.XP;
	}
	public int get_sidekickattack() {
		return this.attack;
	}
	public int get_sidekickoutof() {
		return this.outof;
	}
}
class minions extends sidekick implements Comparable<sidekick>{
	minions(String name,int XP,int HP,int attack,int outof){
		super(name, XP, HP,attack,outof); 
	}
	@Override
	public boolean equals(Object o1) {
		if(o1!=null&& getClass()==o1.getClass()) {
			sidekick o=(sidekick) o1;
			return (name==o.name&&XP==o.XP&& HP==o.HP&&attack==o.attack&&outof==o.outof);
		}
		else {
			return false;
		}
	}
	@Override
	public int compareto(sidekick sd) {
		if((name==sd.name&&XP==sd.XP&& HP==sd.HP&&attack==sd.attack&&outof==sd.outof))
			return 1;
		else
			return 0;
	}
}
class knight extends sidekick implements Comparable<sidekick>{
	knight(String name,int XP,int HP,int attack,int outof){
		super(name, XP, HP,attack,outof); 
	}
	@Override
	public boolean equals(Object o1) {
		if(o1!=null&& getClass()==o1.getClass()) {
			sidekick o=(sidekick) o1;
			return (name==o.name&&XP==o.XP&& HP==o.HP&&attack==o.attack&&outof==o.outof);
		}
		else {
			return false;
		}
	}
	@Override
	public int compareto(sidekick sd) {
		if(name==sd.name&&XP==sd.XP&& HP==sd.HP&&attack==sd.attack&&outof==sd.outof)
			return 1;
		else
			return 0;
	}
}


///////////////////////////////////////////////////////////////////////////
class monster{
	protected final String name;
	protected final int level;
	protected int HP;
	protected int outof;
	monster(String name,int level,int HP,int outof){
		this.name=name;
		this.level=level;
		this.HP=HP;
		this.outof=outof;
	}
	public void set_monsterHP(int HP) {
		this.HP=HP;
	}
	public void set_outof(int outof) {
		this.outof=outof;
	}
	public String get_monstername() {
		return this.name;
	}
	public int get_monsterHP() {
		return this.HP;
	}
	public int get_monsterlevel() {
		return this.level;
	}
	public int get_outof() {
		return this.outof;
	}
	public void set_moutof(int outof) {
		this.outof=outof;
	}
}
class hero{
	protected final String name;
	protected int XP;
	protected int HP;
	protected int attack;
	protected int defence;
	protected int outof;
	hero(String name,int XP,int HP,int attack,int defence,int outof){
		this.name=name;
		this.HP=HP;
		this.XP=XP;
		this.attack=attack;
		this.defence=defence;
		this.outof=outof;
	}
	public void specialattack() {
		this.attack=attack;
		this.defence=defence;
	}
	public void set_heroHP(int HP) {
		this.HP=HP;
	}
	public void set_heroXP(int XP) {
		this.XP=XP;
	}
	public void set_attack(int attack) {
		this.attack=attack;
	}
	public void set_defence(int defence) {
		this.defence=defence;
	}
	public String get_heroname() {
		return this.name;
	}
	public void set_houtof(int outof) {
		this.outof=outof;
	}
	public int get_heroHP() {
		return this.HP;
	}
	public int get_heroXP() {
		return this.XP;
	}
	public int get_attack() {
		return this.attack;
	}
	public int get_defence() {
		return this.defence;
	}
	public int get_houtof() {
		return this.outof;
	}
}
class Goblins extends monster{
	Goblins(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
class Zombies extends monster{
	Zombies(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
class Fiends extends monster{
	Fiends(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
class LionFang extends monster{
	LionFang(String name,int level,int HP,int outof){
		super(name,level,HP,outof);
	}	
}
///////////////////////////////////////////////////////////
class Warrior extends hero{
	Warrior(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override 
	public void specialattack() {
		this.set_attack(get_attack()+5);
		this.set_defence(get_defence()+5);
		
	}
}
class Mage extends hero {
	Mage(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override
	public void specialattack() {
		this.set_heroHP(get_heroXP());
	}
}
class Thief extends hero{
	Thief(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override
	public void specialattack() {
		this.set_heroHP(get_heroXP());
	}
}
class Healer extends hero{
	Healer(String name,int XP,int HP,int attack,int defence,int outof){
		super(name, XP, HP,attack,defence,outof); 
	}
	@Override
	public void specialattack() {
		this.set_heroXP((int)(get_heroXP()+get_heroXP()*0.05));
	}
}
public class ArchLegends2 {
	static int newgain=50;
	static int newxpgain=0;
	static int f=1;
	static ArrayList<hero> n_hero=new ArrayList<hero>();
	static ArrayList<monster> n_monster=new ArrayList<monster>();
	static ArrayList<sidekick> side=new ArrayList<sidekick>();
////////////////////////////////////////////////////////////////////////////////////////
	public static String hero_det(int new_i,int newrand1) {
		n_hero.get(0).set_attack(10);
		n_hero.get(0).set_defence(3);
		n_hero.get(2).set_attack(5);
		n_hero.get(2).set_defence(5);
		n_hero.get(1).set_attack(6);
		n_hero.get(1).set_defence(4);
		n_hero.get(3).set_attack(4);
		n_hero.get(3).set_defence(8);
		String s="YOUR HP:"+0+"/"+n_hero.get(new_i).get_houtof()+" MONSTER HP:"+n_monster.get(newrand1).get_monsterHP()+"/"+n_monster.get(newrand1).get_outof();
		//System.out.println();
		if(n_hero.get(new_i).get_houtof()==100) {
			n_hero.get(new_i).set_heroHP(100);
			n_hero.get(new_i).set_houtof(100);
		}
		if(n_hero.get(new_i).get_houtof()==150) {
			n_hero.get(new_i).set_heroHP(150);
			n_hero.get(new_i).set_houtof(150);
		}
		if(n_hero.get(new_i).get_houtof()==200) {
			n_hero.get(new_i).set_heroHP(200);
			n_hero.get(new_i).set_houtof(200);
		}
		if(n_hero.get(new_i).get_houtof()==250) {
			n_hero.get(new_i).set_heroHP(250);
			n_hero.get(new_i).set_houtof(250);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==1) {
			n_monster.get(newrand1).set_monsterHP(100);
			n_monster.get(newrand1).set_outof(100);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==2) {
			n_monster.get(newrand1).set_monsterHP(100);
			n_monster.get(newrand1).set_outof(100);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==3) {
			n_monster.get(newrand1).set_monsterHP(200);
			n_monster.get(newrand1).set_outof(200);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==4) {
			n_monster.get(newrand1).set_monsterHP(250);
			n_monster.get(newrand1).set_outof(250);
		}
		side.get(0).set_sidekickHP(100);
		side.get(1).set_sidekickHP(100);
		
		return s;
	}
//////////////////////////////////////////////////////////////////////////////////////	
	public static String monst_det(int new_i,int newrand1,int gain) {
		n_hero.get(0).set_attack(10);
		n_hero.get(0).set_defence(3);
		n_hero.get(2).set_attack(5);
		n_hero.get(2).set_defence(5);
		n_hero.get(1).set_attack(6);
		n_hero.get(1).set_defence(4);
		n_hero.get(3).set_attack(4);
		n_hero.get(3).set_defence(8);
		String s="20XP REWARDED";
		int xp=n_hero.get(new_i).get_heroXP()+(20-newxpgain);
		n_hero.get(new_i).set_heroXP(xp);
		int g1=n_hero.get(new_i).get_attack()+f;
		n_hero.get(new_i).set_attack(g1);
		int g2=n_hero.get(new_i).get_defence()+f;
		n_hero.get(new_i).set_defence(g2);
		/*if(n_hero.get(new_i).get_heroXP()==0) {
			n_hero.get(new_i).set_heroHP(100);
			n_hero.get(new_i).set_houtof(100);
		}
		if(n_hero.get(new_i).get_heroXP()<=20&&n_hero.get(new_i).get_heroXP()>0) {
			n_hero.get(new_i).set_heroHP(150);
			n_hero.get(new_i).set_houtof(150);
		}
		if(n_hero.get(new_i).get_heroXP()<=40&&n_hero.get(new_i).get_heroXP()>20) {
			n_hero.get(new_i).set_heroHP(200);
			n_hero.get(new_i).set_houtof(200);
		}
		if(n_hero.get(new_i).get_heroXP()<=60&&n_hero.get(new_i).get_heroXP()>40) {
			n_hero.get(new_i).set_heroHP(250);
			n_hero.get(new_i).set_houtof(250);
		}*/
		n_hero.get(new_i).set_heroHP(100+gain);
		n_hero.get(new_i).set_houtof(100+gain);
		gain+=50;
		newgain=gain;
		side.get(0).set_sidekickHP(100);
		side.get(1).set_sidekickHP(100);
		f+=1;
		if(n_monster.get(newrand1).get_monsterlevel()==1) {
			n_monster.get(newrand1).set_monsterHP(100);
			n_monster.get(newrand1).set_outof(100);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==2) {
			n_monster.get(newrand1).set_monsterHP(100);
			n_monster.get(newrand1).set_outof(100);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==3) {
			n_monster.get(newrand1).set_monsterHP(200);
			n_monster.get(newrand1).set_outof(200);
		}
		if(n_monster.get(newrand1).get_monsterlevel()==4) {
			n_monster.get(newrand1).set_monsterHP(250);
			n_monster.get(newrand1).set_outof(250);
		}
		return s;
	}
////////////////////////////////////////////////////////////////////////////////////////
	public static int calc_mean(int[] arr,int n) {
		int sum=0;
		int m=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		m=sum/n;
		return m;
	}
	static double variance(int a[], int n)
    {
       double sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        double mean = (double)sum/(double)n;
        double sqDiff = 0;
        for (int i = 0; i < n; i++) 
            sqDiff += (a[i] - mean) * (a[i] - mean);
        return (double)sqDiff/n;
    }
	public static double calc_stdeviation(int[] arr, int n) {
		int s=0;
		return Math.sqrt(variance(arr, n));
	}
	static hero hero;
	static monster monster;
	static sidekick sidekick;
	static sidekick cloned1;
	static sidekick cloned2;
	static sidekick cloned3;
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		int option=0;
		int mean=0;
		int sum=0;
		int attack=0;
		double a=0;
		int standard_deviation=0;
		int newmini=0;
		int forxp=0;
		Scanner s=new Scanner(System.in);
		Random rand = new Random();
		hero=new hero("WARRIOR",0,100,10,3,100);
		n_hero.add(hero);
		hero=new hero("THIEF",0,100,6,4,100);
		n_hero.add(hero);
		hero=new hero("MAGE",0,100,5,5,100);
		n_hero.add(hero);
		hero=new hero("HEALER",0,100,4,8,100);
		n_hero.add(hero);
		///////////////////////////////////////////
		monster=new monster("GOBLINS",1,100,100);
		n_monster.add(monster);
		monster=new monster("ZOMBIES",2,100,100);
		n_monster.add(monster);
		monster=new monster("FIENDS",3,200,200);
		n_monster.add(monster);
		monster=new monster("LIONFANG",4,250,250);
		n_monster.add(monster);
		///////////////////////////////////////////
		sidekick=new sidekick("MINIONS",0,100,1,100);
		side.add(sidekick);
		sidekick=new sidekick("KNIGHT",0,100,2,100);
		side.add(sidekick);
		////////////////////////////////////////////
		Boolean t0=true;
		Boolean t1=true;
		Boolean t2=true;
		Boolean t3=true;
		Boolean t4=true;
		Boolean t5=true;
		Boolean t6=true;
		Boolean t7=true;
		Boolean t8=true;
		Boolean t9=true;
		Boolean t10=true;
		int direction=0;
		int i=0;
		int y=0;
		int assign=0;
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int rand1=0;
		double find=0;
		String choose="f";
		int newat=0;
		int get=1;
		int flag1=0;
		int flag2=0;
		int flag3=0;
		int flag4=1;
		int useclone=0;
		int forcheck=0;
		
		while(t1!=false) {
			System.out.println("WELCOME TO ARCHLEGENDS");
			System.out.println("CHOOSE YOUR OPTION");
			System.out.println("1) NEW USER");
			System.out.println("2) EXISTING USER");
			System.out.println("3) EXIT");
			int q1=s.nextInt();
			if(q1==1) {
				System.out.println("ENTER USERNAME");
				String user_name=s.next();
				arr1.add(user_name);
				System.out.println("CHOOSE A HERO");
				System.out.println("1) WARRIOR");
				System.out.println("2) THIEF");
				System.out.println("3) MAGE");
				System.out.println("4) HEALER");
				int hero=s.nextInt();
				i=hero;
				System.out.println("USER CREATION DONE....USERNAME:"+arr1.get(y)+" HERO TYPE:"+n_hero.get(i-1).get_heroname()+" LOG IN TO PLAY THE GAME..EXITING");
				y+=1;	
			}
			if(q1==2) {
				System.out.println("ENTER USERNAME");
				String find_name=s.next();
				for(int j=0;j<arr1.size();j++) {
					if(arr1.get(j).contentEquals(find_name)) {
						System.out.println("USER FOUND....LOGING IN");
						System.out.println("WELCOME "+arr1.get(j));
						t6=true;
						while(t6!=false) {
						t7=true;
						if((n_hero.get(i-1).get_houtof()==100)&&t7!=false) {
							System.out.println("YOU ARE AT THE STARTING LOCATION...CHOOSE PATH");
							System.out.println("1) GO TO LOCATION 0");
							System.out.println("2) GO TO LOCATION 3");
							System.out.println("3) GO TO LOCATION 6");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						t8=true;
						if((n_hero.get(i-1).get_houtof()==150)&&t8!=false) {
							System.out.println("1) GO TO LOCATION 1");
							System.out.println("2) GO TO LOCATION 4");
							System.out.println("3) GO TO LOCATION 7");
							System.out.println("3) GO BACK TO PREVIOUS PATH");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						t9=true;
						if((n_hero.get(i-1).get_houtof()==200)&&t9!=false) {
							System.out.println("1) GO TO LOCATION 2");
							System.out.println("2) GO TO LOCATION 5");
							System.out.println("3) GO TO LOCATION 8");
							System.out.println("3) GO BACK TO PREVIOUS PATH");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						t10=true;
						if((n_hero.get(i-1).get_houtof()==250)&&t10!=false) {
							System.out.println("1) GO TO LOCATION 10");
							System.out.println("3) GO BACK TO PREVIOUS PATH");
							System.out.println("4) ENTER -1 TO EXIT");
						}
						int in1=s.nextInt();
						t4=true;
						while(t4!=false) {
							if(n_hero.get(i-1).get_houtof()==100) {
							if(in1==1)
								direction=0;
							else if(in1==2)
								direction=3;
							else if(in1==3)
								direction=6;
							else if(in1==-1)
								t0=t2=t3=t4=t6=t7=t8=t9=t10=false;
							}
							if(n_hero.get(i-1).get_houtof()==150) {
								if(in1==1)
									direction=1;
								else if(in1==2)
									direction=4;
								else if(in1==3)
									direction=7;
								else if(in1==4)
									t4=t10=t8=t9=false;
								else if(in1==-1)
									t0=t2=t3=t4=t6=t7=t8=t9=t10=false;
								}
							if(n_hero.get(i-1).get_houtof()==200) {
								if(in1==1)
									direction=2;
								else if(in1==2)
									direction=5;
								else if(in1==3)
									direction=8;
								else if(in1==4)
									t4=t7=t9=t10=false;
								else if(in1==-1)
									t0=t2=t3=t4=t6=t7=t8=t9=t10=false;
								}
							if(n_hero.get(i-1).get_houtof()==250) {
								if(in1==1)
									direction=10;
								else if(in1==2)
									t4=t7=t8=t10=false;
								else if(in1==3)
									t4=t10=t8=t7=false;
								else if(in1==-1)
									t0=t2=t3=t4=t6=t7=t8=t9=t10=false;
								
								}
							System.out.println("MOVING TO LOCATION "+direction);
							if(n_hero.get(i-1).get_houtof()>=100&&n_hero.get(i-1).get_houtof()<=200)
								rand1=rand.nextInt(3);
							else
								rand1=3;
							double find_xp=n_monster.get(rand1).get_monsterHP()*0.25;
							int idx=(int)Math.ceil(find_xp);
							int arr[]=new int[idx];
							for(int k=0;k<find_xp;k++) {
								arr[k]=k+1;
							}
							mean=calc_mean(arr,idx);
							standard_deviation=(int)calc_stdeviation(arr,idx);
							System.out.println("FIGHT STARTED..YOUR FIGHTING A LEVEL "+(rand1+1)+" MONSTER");
							if(flag1==1) {
							System.out.println("TYPE YES IF YOU WISH TO USE A SIDE KICK...ELSE TYPE NO");
							String yourchoice=s.next();
							if(yourchoice.contentEquals("yes")||yourchoice.contentEquals("YES")) {
							System.out.println("YOU HAVE A SIDEKICK "+side.get(option-1).get_sidekickname()+" WITH YOU..ATTACK OF SIDEKICK IS "+side.get(option-1).get_sidekickattack());
							if(side.get(option-1).get_sidekickHP()>0&&flag4==1&&useclone==0&&flag2==1) {
							System.out.println("PRESS C TO USE CLONING ABILITY..ELSE PRESS F TO MOVE TO THE FIGHT");
							choose=s.next();
							if(choose.contentEquals("c")||choose.contentEquals("C")) {
								
								cloned1 = (sidekick) sidekick.clone();
								cloned2 = (sidekick) sidekick.clone();
								cloned3 = (sidekick) sidekick.clone();
								if(cloned1.equals(sidekick)&&cloned2.equals(sidekick)&&cloned3.equals(sidekick)) {
								cloned1.set_sidekickattack(side.get(option-1).get_sidekickattack()+newmini);
								cloned2.set_sidekickattack(side.get(option-1).get_sidekickattack()+newmini);
								cloned3.set_sidekickattack(side.get(option-1).get_sidekickattack()+newmini);
								System.out.println("CLONING DONE....");
								useclone=1;
							}}}
							}}
							t5=true;
							while(n_monster.get(rand1).get_monsterHP()>0&&t5!=false) {
								t0=true;
								if(n_monster.get(rand1).get_monsterlevel()<4) {
									a=rand.nextGaussian();
									Math.abs(a);
									attack=(int)a*standard_deviation+mean;
									newat=attack;
								}
								System.out.println("CHOOSE MOVE:");
								System.out.println("1) ATTACK");
								System.out.println("2) DEFENCE");
								assign+=1;
								if(assign%4==0&&assign!=0&&t0==true){
									System.out.println("3) SPECIAL ATTACK");
									count1=0;
									count2=0;
									count3=0;
									count4=0;
									assign-=1;
								}
								forcheck=0;
								int q2=s.nextInt();
								if(q2==1) {
									if(((i-1)==0)&&count1%4==0&&count1!=0&&count5<4&&forcheck==1) {
										
										int hp=n_hero.get(i-1).get_attack()+5;
										n_hero.get(i-1).set_attack(hp);
										int df=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(df);
										count5+=1;
										if(count5==3&&((i-1)==0)) {
											n_hero.get(i-1).set_attack(10);
											n_hero.get(i-1).set_defence(3);
										}
									}
									
									else if((i-1)==2&&count3%4==0&&count3!=0) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.05);
									}
									else if((i-1)==3&&count4%4==0&&count4!=0) {
										int hp=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.05);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
									}
									System.out.println("YOU CHOOSE TO ATTACK");
									System.out.println("YOU ATTACK AND INFLICTED "+n_hero.get(i-1).get_attack()+" DAMAGE TO THE MONSTER");
									if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
										System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
										if(flag2==1&&flag4==1) {
											useclone=1;
											System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
											System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
											System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
											int set=n_monster.get(rand1).get_monsterHP()-(n_hero.get(i-1).get_attack()+(4*side.get(option-1).get_sidekickattack()));
											n_monster.get(rand1).set_monsterHP(set);
										}
										else {
										int set=n_monster.get(rand1).get_monsterHP()-(n_hero.get(i-1).get_attack()+side.get(option-1).get_sidekickattack());
										n_monster.get(rand1).set_monsterHP(set);
										}
									}
									else {
									int set=n_monster.get(rand1).get_monsterHP()-n_hero.get(i-1).get_attack();
									n_monster.get(rand1).set_monsterHP(set);
									}
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
										System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
										if(flag4==1&&flag2==1) {
											cloned1.set_sidekickHP((float)1.5*side.get(option-1).get_sidekickHP());
											cloned2.set_sidekickHP((float)1.5*side.get(option-1).get_sidekickHP());
											cloned3.set_sidekickHP((float)1.5*side.get(option-1).get_sidekickHP());
											cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
											cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
											cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
											System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
											System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
											System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
										}
									}
									if(n_monster.get(rand1).get_monsterHP()<1) {
										if(n_monster.get(rand1).get_monsterlevel()<4) {
										if(n_hero.get(i-1).get_heroXP()>0&&flag1==1) {
											newxpgain=2;
											side.get(option-1).set_sidekickXP(side.get(option-1).get_sidekickXP()+newxpgain);}
										flag2=flag3=0;
										if(n_monster.get(rand1).get_monsterlevel()==2&&option==2)
											n_hero.get(i-1).set_defence(n_hero.get(i-1).get_defence()-5);
											
											if(useclone==1)
												flag4=0;
											System.out.println("MONSTER KILLED!");
											String news1=monst_det(i-1,rand1,newgain);
											System.out.println(news1);
											System.out.println("FIGHT WON PROCEED TO THE NEXT LOCATION");
											System.out.println("IF YOU WOULD YOU LIKE TO BUY A SIDEKICK, TYPE YES...ELSE TYPE NO TO UPGRADE LEVEL");
											String answer=s.next();
											if(answer.contentEquals("YES")||answer.contentEquals("yes")&&n_hero.get(i-1).get_heroXP()>8) {
												flag1=1;
												System.out.println("YOUR CURRENT XP IS:"+n_hero.get(i-1).get_heroXP());
												System.out.println("IF YOU WANT TO BUY A MINION...PRESS 1");
												System.out.println("IF YOU WANT TO BUY A KNIGHT...PRESS 2");
												option=s.nextInt();
												if(option==1)
													flag2=1;
												else
													flag3=1;
												
												System.out.println("XP TO SPEND:");
												forxp=s.nextInt();
												if(flag2==1)
													newmini=(int)Math.ceil((forxp-5)*0.5);
												if(flag3==1)
													newmini=(int)Math.ceil((forxp-8)*0.5);
												side.get(option-1).set_sidekickattack(side.get(option-1).get_sidekickattack()+newmini);
												n_hero.get(i-1).set_heroXP(n_hero.get(i-1).get_heroXP()-forxp);
												System.out.println("YOU BOUGHT A SIDEKICK: "+side.get(option-1).get_sidekickname());
												System.out.println("XP OF SIDEKICK IS: "+side.get(option-1).get_sidekickXP());
												System.out.println("ATTACK OF SIDEKICK:"+side.get(option-1).get_sidekickattack());
												assign=0;
												t4=false;
												t5=false;
												break;
											}
											else {
											assign=0;
											t4=false;
											t5=false;
											break;}
											}else if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_houtof()==250){
										
												System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
												t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
												break;
											}}
									System.out.println("MONSTER ATTACK");
									if(n_monster.get(rand1).get_monsterlevel()==4) {
										get=rand.nextInt(9);
										if(get==1) {
											attack=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.5);
											}
										else {
											mean=calc_mean(arr,idx);
											standard_deviation=(int)calc_stdeviation(arr,idx);
											a=(int)rand.nextGaussian();
											Math.abs(a);
											attack=(int)a*standard_deviation+mean;
										}}
									else {
										attack=(int)a*standard_deviation+mean;
									}
									System.out.println("THE MONSTER ATTACKED AND INFLICTED "+attack+" DAMAGE TO YOU");
									int hp=n_hero.get(i-1).get_heroHP()-(attack);
									n_hero.get(i-1).set_heroHP(hp);
									float sideattack=(float)1.5*attack;
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
										side.get(option-1).set_sidekickHP(side.get(option-1).get_sidekickHP()-sideattack);
										System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
										if(flag2==1&&flag4==1) {
											cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
											cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
											cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
											System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
											System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
											System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
										}
									}
									if(n_hero.get(i-1).get_heroHP()<1) {
										String news1=hero_det(i-1,rand1);
										System.out.println("YOU LOOSE THE GAME...");
										System.out.println(news1);
										assign=0;
										t4=false;
										t5=false;
										break;}
								}
								
								if(q2==2) {
									if(flag1==1&&flag3==1&&rand1==1) {
										int hp=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(hp);
									}
									
									if(((i-1)==0)&&count1%4==0&&count1!=0&&count5<4&&forcheck==1) {
										int hp=n_hero.get(i-1).get_attack()+5;
										n_hero.get(i-1).set_attack(hp);
										int df=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(df);
										count5+=1;
										if(count5==3&&((i-1)==0)) {
											n_hero.get(i-1).set_attack(10);
											n_hero.get(i-1).set_defence(3);
										}
									}
									
									else if((i-1)==2&&count3%4==0&&count3!=0) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.05);
									}
									else if((i-1)==3&&count4%4==0&&count4!=0) {
										int hp=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.05);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
									}
									
									System.out.println("YOU CHOOSE TO DEFEND");
									System.out.println("MONSTER ATTACK REDUCED BY "+n_hero.get(i-1).get_defence()+"!");
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									System.out.println("MONSTER ATTACK");
									if(n_monster.get(rand1).get_monsterlevel()==4) {
										get=rand.nextInt(9);
										if(get==1) {
											attack=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.5);
											}
										else {
											mean=calc_mean(arr,idx);
											standard_deviation=(int)calc_stdeviation(arr,idx);
											a=(int)rand.nextGaussian();
											Math.abs(a);
											attack=(int)a*standard_deviation+mean;
										}}
									else {
										attack=(int)a*standard_deviation+mean;
									}
									int def=attack-n_hero.get(i-1).get_defence();
									if(attack<n_hero.get(i-1).get_defence()) {
										def=0;
									}
									System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
									int hp=n_hero.get(i-1).get_heroHP()-def;
									n_hero.get(i-1).set_heroHP(hp);
									float sideattack=(float)1.5*attack;
									System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
									if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
										side.get(option-1).set_sidekickHP(side.get(option-1).get_sidekickHP()-sideattack);
										System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
										if(flag2==1&&flag4==1) {
											cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
											cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
											cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
											System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
											System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
											System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
										}
									}
									if(n_hero.get(i-1).get_heroHP()<1) {
										String news1=hero_det(i-1,rand1);
										System.out.println("YOU LOOSE THE GAME...");
										System.out.println(news1);
										assign=0;
										t4=false;
										t5=false;
										break;}}
								
								if(q2==3) {
									count1+=4;
									count3+=4;
									count4+=4;
									System.out.println("SPECIAL POWER ACTIVATED");
									System.out.println("PERFORMING SPECIAL ATTACK");
									if((i-1)==0) {
										forcheck=1;
										int hp=n_hero.get(i-1).get_attack()+5;
										n_hero.get(i-1).set_attack(hp);
										int df=n_hero.get(i-1).get_defence()+5;
										n_hero.get(i-1).set_defence(df);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
										System.out.println("YOU ATTACK AND INFLICTED "+hp+" DAMAGE TO THE MONSTER!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
											System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
											if(flag2==1&&flag4==1) {
												useclone=1;
												System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
												System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
												System.out.println("SIDEKICK ATTACK AND INFLICTED "+side.get(option-1).get_sidekickattack()+" DAMAGE TO THE MONSTER");
												int set=n_monster.get(rand1).get_monsterHP()-(n_hero.get(i-1).get_attack()+(4*side.get(option-1).get_sidekickattack()));
												n_monster.get(rand1).set_monsterHP(set);
											}
											else {
											int set=n_monster.get(rand1).get_monsterHP()-(n_hero.get(i-1).get_attack()+side.get(option-1).get_sidekickattack());
											n_monster.get(rand1).set_monsterHP(set);
											}
										}
										else {
										int set=n_monster.get(rand1).get_monsterHP()-n_hero.get(i-1).get_attack();
										n_monster.get(rand1).set_monsterHP(set);
										}
										//System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
											System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
											if(flag4==1&&flag2==1) {
												cloned1.set_sidekickHP((float)1.5*side.get(option-1).get_sidekickHP());
												cloned2.set_sidekickHP((float)1.5*side.get(option-1).get_sidekickHP());
												cloned3.set_sidekickHP((float)1.5*side.get(option-1).get_sidekickHP());
												cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
												System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
											}
										}
										if(n_monster.get(rand1).get_monsterHP()<1) {
											if(n_monster.get(rand1).get_monsterlevel()<4) {
											if(n_hero.get(i-1).get_heroXP()>0&&flag1==1) {
												newxpgain=2;
												side.get(option-1).set_sidekickXP(side.get(option-1).get_sidekickXP()+newxpgain);}
											flag2=flag3=0;
											if(n_monster.get(rand1).get_monsterlevel()==2&&option==2)
												n_hero.get(i-1).set_defence(n_hero.get(i-1).get_defence()-5);
												
												if(useclone==1)
													flag4=0;
												System.out.println("MONSTER KILLED!");
												String news1=monst_det(i-1,rand1,newgain);
												System.out.println(news1);
												System.out.println("FIGHT WON PROCEED TO THE NEXT LOCATION");
												System.out.println("IF YOU WOULD YOU LIKE TO BUY A SIDEKICK, TYPE YES...ELSE TYPE NO TO UPGRADE LEVEL");
												String answer=s.next();
												if(answer.contentEquals("YES")||answer.contentEquals("yes")&&n_hero.get(i-1).get_heroXP()>8) {
													flag1=1;
													System.out.println("YOUR CURRENT XP IS:"+n_hero.get(i-1).get_heroXP());
													System.out.println("IF YOU WANT TO BUY A MINION...PRESS 1");
													System.out.println("IF YOU WANT TO BUY A KNIGHT...PRESS 2");
													option=s.nextInt();
													if(option==1)
														flag2=1;
													else
														flag3=1;
													
													System.out.println("XP TO SPEND:");
													forxp=s.nextInt();
													if(flag2==1)
														newmini=(int)Math.ceil((forxp-5)*0.5);
													if(flag3==1)
														newmini=(int)Math.ceil((forxp-8)*0.5);
													side.get(option-1).set_sidekickattack(side.get(option-1).get_sidekickattack()+newmini);
													n_hero.get(i-1).set_heroXP(n_hero.get(i-1).get_heroXP()-forxp);
													System.out.println("YOU BOUGHT A SIDEKICK: "+side.get(option-1).get_sidekickname());
													System.out.println("XP OF SIDEKICK IS: "+side.get(option-1).get_sidekickXP());
													System.out.println("ATTACK OF SIDEKICK:"+side.get(option-1).get_sidekickattack());
													assign=0;
													t4=false;
													t5=false;
													break;
												}
												else {
												assign=0;
												t4=false;
												t5=false;
												break;}
												}else if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_houtof()==250){
											
													System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
													t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
													break;
												}}
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										float sideattack=(float)1.5*attack;
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
											side.get(option-1).set_sidekickHP(side.get(option-1).get_sidekickHP()-sideattack);
											System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
											if(flag2==1&&flag4==1) {
												cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
												System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
											}
										}
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											String news1=hero_det(i-1,rand1);
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println(news1);
											assign=0;
											t4=false;
											t5=false;
											break;
										}
										t0=false;
									}
									else if((i-1)==1) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.30);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
										if(n_hero.get(i-1).get_heroHP()>100)
											n_hero.get(i-1).set_heroHP(100);
										System.out.println("YOU HAVE STOLEN "+hp+"HP FROM THE MONSTER!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(n_monster.get(rand1).get_monsterHP()<1) {
											if(n_hero.get(i-1).get_heroXP()>0&&flag1==1) {
												newxpgain=2;
												side.get(option-1).set_sidekickXP(side.get(option-1).get_sidekickXP()+newxpgain);}
											flag2=flag3=0;
											if(n_monster.get(rand1).get_monsterlevel()==2&&option==2)
												n_hero.get(i-1).set_defence(n_hero.get(i-1).get_defence()-5);
												if(n_monster.get(rand1).get_monsterlevel()<4) {
												if(useclone==1)
													flag4=0;
												System.out.println("MONSTER KILLED!");
												String news1=monst_det(i-1,rand1,newgain);
												System.out.println(news1);
												System.out.println("FIGHT WON PROCEED TO THE NEXT LOCATION");
												System.out.println("IF YOU WOULD YOU LIKE TO BUY A SIDEKICK, TYPE YES...ELSE TYPE NO TO UPGRADE LEVEL");
												String answer=s.next();
												if(answer.contentEquals("YES")||answer.contentEquals("yes")&&n_hero.get(i-1).get_heroXP()>8) {
													flag1=1;
													System.out.println("YOUR CURRENT XP IS:"+n_hero.get(i-1).get_heroXP());
													System.out.println("IF YOU WANT TO BUY A MINION...PRESS 1");
													System.out.println("IF YOU WANT TO BUY A KNIGHT...PRESS 2");
													option=s.nextInt();
													if(option==1)
														flag2=1;
													else
														flag3=1;
													
													System.out.println("XP TO SPEND:");
													forxp=s.nextInt();
													if(flag2==1)
														newmini=(int)Math.ceil((forxp-5)*0.5);
													if(flag3==1)
														newmini=(int)Math.ceil((forxp-8)*0.5);
													side.get(option-1).set_sidekickattack(side.get(option-1).get_sidekickattack()+newmini);
													n_hero.get(i-1).set_heroXP(n_hero.get(i-1).get_heroXP()-forxp);
													System.out.println("YOU BOUGHT A SIDEKICK: "+side.get(option-1).get_sidekickname());
													System.out.println("XP OF SIDEKICK IS: "+side.get(option-1).get_sidekickXP());
													System.out.println("ATTACK OF SIDEKICK:"+side.get(option-1).get_sidekickattack());
													assign=0;
													t4=false;
													t5=false;
													break;
												}
												else {
												assign=0;
												t4=false;
												t5=false;
												break;}
												}}if(n_monster.get(rand1).get_monsterlevel()==4&&n_hero.get(i-1).get_houtof()==250){
													System.out.println("YOU WIN THE GAME ALL MONSTERS ARE KILLED");
													t2=t3=t4=t5=t6=t7=t8=t9=t10=false;
													break;
												}
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										float sideattack=(float)1.5*attack;
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
											side.get(option-1).set_sidekickHP(side.get(option-1).get_sidekickHP()-sideattack);
											System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
											if(flag2==1&&flag4==1) {
												cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
												System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
											}
										}
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											String news1=hero_det(i-1,rand1);
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println(news1);
											assign=0;
											t4=false;
											t5=false;
											break;
										}
										t0=false;
									}
									else if((i-1)==2) {
										int hp=(int)Math.ceil(n_monster.get(rand1).get_monsterHP()*0.05);
										n_monster.get(rand1).set_monsterHP(n_monster.get(rand1).get_monsterHP()-hp);
										System.out.println("YOU REDUCES OPPENENT HP BY "+hp+"!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										float sideattack=(float)1.5*attack;
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
											side.get(option-1).set_sidekickHP(side.get(option-1).get_sidekickHP()-sideattack);
											System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
											if(flag2==1&&flag4==1) {
												cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
												System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
											}
										}
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										count3+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											String news1=hero_det(i-1,rand1);
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println(news1);
											assign=0;
											t4=false;
											t5=false;
											break;
										}
										t0=false;
									}
									else if((i-1)==3) {
										int hp=(int)Math.ceil(n_hero.get(i-1).get_heroHP()*0.05);
										n_hero.get(i-1).set_heroHP(n_hero.get(i-1).get_heroHP()+hp);
										System.out.println("YOUR HP INCREASE BY "+hp+"!");
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										System.out.println("MONSTER ATTACK");
										int def=attack-n_hero.get(i-1).get_defence();
										if(attack<n_hero.get(i-1).get_defence()) {
											def=0;
										}
										System.out.println("THE MONSTER ATTACKED AND INFLICTED "+def+" DAMAGE TO YOU");
										int h=n_hero.get(i-1).get_heroHP()-def;
										n_hero.get(i-1).set_heroHP(h);
										float sideattack=(float)1.5*attack;
										System.out.println("YOUR HP:"+n_hero.get(i-1).get_heroHP()+"/"+n_hero.get(i-1).get_houtof()+" MONSTER HP:"+n_monster.get(rand1).get_monsterHP()+"/"+n_monster.get(rand1).get_outof());
										if(flag1==1&&side.get(option-1).get_sidekickHP()>0) {
											side.get(option-1).set_sidekickHP(side.get(option-1).get_sidekickHP()-sideattack);
											System.out.println("SIDEKICK'S HP:"+side.get(option-1).get_sidekickHP()+"/100");
											if(flag2==1&&flag4==1) {
												cloned1.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned2.set_sidekickHP(side.get(option-1).get_sidekickHP());
												cloned3.set_sidekickHP(side.get(option-1).get_sidekickHP());
												System.out.println("SIDEKICK'S HP:"+cloned1.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned2.get_sidekickHP()+"/100");
												System.out.println("SIDEKICK'S HP:"+cloned3.get_sidekickHP()+"/100");
											}
										}
										System.out.println("SPECIAL POWER DEACTIVATED");
										assign+=1;
										count4+=1;
										if(n_hero.get(i-1).get_heroHP()<1) {
											String news1=hero_det(i-1,rand1);
											System.out.println("YOU LOOSE THE GAME...");
											System.out.println(news1);
											assign=0;
											t4=false;
											t5=false;
											break;
										}
										t0=false;} } } }
							
							t4=false; } } }
			if(q1==3)
				t1=false;
			} } } }