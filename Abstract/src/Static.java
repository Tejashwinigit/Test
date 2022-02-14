import java.util.Scanner;
interface client
{
	void input();//public abstract
void output();

}
class Static implements client
{
	String name; double sal;
	public void input()
	{
		Scanner r=new Scanner (System.in);
		System.out.println("enter username:");
		name=r.nextLine();
	}
	public void output()
	{
		System.out.println(name+""+sal);
	}
	public static void main(String[] args) {
		client c=new Static();
		c.input(); c.output();
	}
}
